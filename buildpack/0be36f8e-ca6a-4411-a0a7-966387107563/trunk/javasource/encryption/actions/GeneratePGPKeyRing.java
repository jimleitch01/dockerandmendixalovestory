// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package encryption.actions;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;
import org.bouncycastle.bcpg.ArmoredOutputStream;
import org.bouncycastle.bcpg.HashAlgorithmTags;
import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.bouncycastle.bcpg.sig.Features;
import org.bouncycastle.bcpg.sig.KeyFlags;
import org.bouncycastle.crypto.generators.RSAKeyPairGenerator;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.openpgp.PGPEncryptedData;
import org.bouncycastle.openpgp.PGPKeyPair;
import org.bouncycastle.openpgp.PGPKeyRingGenerator;
import org.bouncycastle.openpgp.PGPPublicKey;
import org.bouncycastle.openpgp.PGPPublicKeyRing;
import org.bouncycastle.openpgp.PGPSecretKeyRing;
import org.bouncycastle.openpgp.PGPSignature;
import org.bouncycastle.openpgp.PGPSignatureSubpacketGenerator;
import org.bouncycastle.openpgp.operator.PBESecretKeyEncryptor;
import org.bouncycastle.openpgp.operator.PGPDigestCalculator;
import org.bouncycastle.openpgp.operator.bc.BcPBESecretKeyEncryptorBuilder;
import org.bouncycastle.openpgp.operator.bc.BcPGPContentSignerBuilder;
import org.bouncycastle.openpgp.operator.bc.BcPGPDigestCalculatorProvider;
import org.bouncycastle.openpgp.operator.bc.BcPGPKeyPair;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import encryption.pgp.PGPFileProcessor;

public class GeneratePGPKeyRing extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __PrivateKey;
	private encryption.proxies.PGPCertificate PrivateKey;
	private IMendixObject __PublicKey;
	private encryption.proxies.PGPCertificate PublicKey;

	public GeneratePGPKeyRing(IContext context, IMendixObject PrivateKey, IMendixObject PublicKey)
	{
		super(context);
		this.__PrivateKey = PrivateKey;
		this.__PublicKey = PublicKey;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.PrivateKey = __PrivateKey == null ? null : encryption.proxies.PGPCertificate.initialize(getContext(), __PrivateKey);

		this.PublicKey = __PublicKey == null ? null : encryption.proxies.PGPCertificate.initialize(getContext(), __PublicKey);

		// BEGIN USER CODE
		
		//Do we generate all files as ASCII armored files?
		boolean armor = true;


		char pass[] = this.PrivateKey.getPassPhrase_Plain().toCharArray();
		PGPKeyRingGenerator krgen = generateKeyRingGenerator(this.PrivateKey.getEmailAddress(), pass);
		
		
		// Generate public key ring, dump to file.
		String tempASC = PGPFileProcessor.getNewTempFile("pub");
		PGPPublicKeyRing pkr = krgen.generatePublicKeyRing();
		
		String pubFilename = "publicKey.pub";
		OutputStream pubout = new BufferedOutputStream(new FileOutputStream(tempASC));
		if( armor ) {
			pubout = new ArmoredOutputStream(pubout);
			pubFilename = "publicKey.asc";
		}
		pkr.encode(pubout);
		pubout.close();

		Core.storeFileDocumentContent(getContext(), this.PublicKey.getMendixObject(), pubFilename, new FileInputStream(tempASC));
		(new File(tempASC)).delete();


		// Generate private key, dump to file.
		String tempSKR = PGPFileProcessor.getNewTempFile("skr");
		PGPSecretKeyRing skr = krgen.generateSecretKeyRing();

		String skrFilename = "privateKey.skr";
		OutputStream secout = new BufferedOutputStream(new FileOutputStream(tempSKR));
		if ( armor ) {
			secout = new ArmoredOutputStream(secout);
			skrFilename = "privateKey.asc";
		}

		skr.encode(secout);
		secout.close();

		Core.storeFileDocumentContent(getContext(), this.PrivateKey.getMendixObject(), skrFilename, new FileInputStream(tempSKR));
		(new File(tempSKR)).delete();

		
		// Random code stuff 
		// PGPSecretKey skey = new Pg
		// PGPSecretKeyRing.insertSecretKey(skr, )
		// skr.getSecretKey().encode(secout);
		

		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GeneratePGPKeyRing";
	}

	// BEGIN EXTRA CODE

	public final static PGPKeyRingGenerator generateKeyRingGenerator( String id, char[] pass ) throws Exception {
		return generateKeyRingGenerator(id, pass, 0xc0);
	}

	// Note: s2kcount is a number between 0 and 0xff that controls the number of times to iterate the password hash
	// before use. More
	// iterations are useful against offline attacks, as it takes more time to check each password. The actual number of
	// iterations is
	// rather complex, and also depends on the hash function in use. Refer to Section 3.7.1.3 in rfc4880.txt. Bigger
	// numbers give
	// you more iterations. As a rough rule of thumb, when using SHA256 as the hashing function, 0x10 gives you about 64
	// iterations, 0x20 about 128, 0x30 about 256 and so on till 0xf0, or about 1 million iterations. The maximum you
	// can go to is
	// 0xff, or about 2 million iterations. I'll use 0xc0 as a default -- about 130,000 iterations.

	public final static PGPKeyRingGenerator generateKeyRingGenerator( String id, char[] pass, int s2kcount ) throws Exception {
		// This object generates individual key-pairs.
		RSAKeyPairGenerator kpg = new RSAKeyPairGenerator();

		// Boilerplate RSA parameters, no need to change anything
		// except for the RSA key-size (2048). You can use whatever key-size makes sense for you -- 4096, etc.
		kpg.init(new RSAKeyGenerationParameters(BigInteger.valueOf(0x10001), new SecureRandom(), 2048, 12));

		// First create the master (signing) key with the generator.
		PGPKeyPair rsakp_sign = new BcPGPKeyPair(PGPPublicKey.RSA_SIGN, kpg.generateKeyPair(), new Date());
		// Then an encryption subkey.
		PGPKeyPair rsakp_enc = new BcPGPKeyPair(PGPPublicKey.RSA_ENCRYPT, kpg.generateKeyPair(), new Date());

		// Add a self-signature on the id
		PGPSignatureSubpacketGenerator signhashgen = new PGPSignatureSubpacketGenerator();

		// Add signed metadata on the signature.
		// 1) Declare its purpose
		signhashgen.setKeyFlags(false, KeyFlags.SIGN_DATA | KeyFlags.CERTIFY_OTHER);
		// 2) Set preferences for secondary crypto algorithms to use when sending messages to this key.
		signhashgen.setPreferredSymmetricAlgorithms
				(false, new int[] {
						SymmetricKeyAlgorithmTags.AES_256,
						SymmetricKeyAlgorithmTags.AES_192,
						SymmetricKeyAlgorithmTags.AES_128
				});
		signhashgen.setPreferredHashAlgorithms
				(false, new int[] {
						HashAlgorithmTags.SHA256,
						HashAlgorithmTags.SHA1,
						HashAlgorithmTags.SHA384,
						HashAlgorithmTags.SHA512,
						HashAlgorithmTags.SHA224,
				});
		// 3) Request senders add additional checksums to the message (useful when verifying unsigned messages.)
		signhashgen.setFeature(false, Features.FEATURE_MODIFICATION_DETECTION);

		// Create a signature on the encryption subkey.
		PGPSignatureSubpacketGenerator enchashgen = new PGPSignatureSubpacketGenerator();
		// Add metadata to declare its purpose
		enchashgen.setKeyFlags(false, KeyFlags.ENCRYPT_COMMS | KeyFlags.ENCRYPT_STORAGE);

		// Objects used to encrypt the secret key.
		PGPDigestCalculator sha1Calc = new BcPGPDigestCalculatorProvider().get(HashAlgorithmTags.SHA1);
		PGPDigestCalculator sha256Calc = new BcPGPDigestCalculatorProvider().get(HashAlgorithmTags.SHA256);

		// bcpg 1.48 exposes this API that includes s2kcount. Earlier versions use a default of 0x60.
		PBESecretKeyEncryptor pske = (new BcPBESecretKeyEncryptorBuilder(PGPEncryptedData.AES_256, sha256Calc, s2kcount)).build(pass);

		// Finally, create the keyring itself. The constructor takes parameters that allow it to generate the self
		// signature.
		PGPKeyRingGenerator keyRingGen =
				new PGPKeyRingGenerator(PGPSignature.POSITIVE_CERTIFICATION, rsakp_sign,
						id, sha1Calc, signhashgen.generate(), null,
						new BcPGPContentSignerBuilder(rsakp_sign.getPublicKey().getAlgorithm(), HashAlgorithmTags.SHA1), pske);

		// Add our encryption subkey, together with its signature.
		keyRingGen.addSubKey(rsakp_enc, enchashgen.generate(), null);
		return keyRingGen;
	}
	// END EXTRA CODE
}
