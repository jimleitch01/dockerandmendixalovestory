// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

public enum DTAPMode
{
	DEVELOPMENT(new java.lang.String[][] { new java.lang.String[] { "en_US", "Development" }, new java.lang.String[] { "nl_NL", "Development" } }),
	TESTING(new java.lang.String[][] { new java.lang.String[] { "en_US", "Testing" }, new java.lang.String[] { "nl_NL", "Testing" } }),
	ACCEPTANCE(new java.lang.String[][] { new java.lang.String[] { "en_US", "Acceptance" }, new java.lang.String[] { "nl_NL", "Acceptance" } }),
	PRODUCTION(new java.lang.String[][] { new java.lang.String[] { "en_US", "Production" }, new java.lang.String[] { "nl_NL", "Production" } }),
	TRIAL(new java.lang.String[][] { new java.lang.String[] { "en_US", "Trial" }, new java.lang.String[] { "nl_NL", "Trial" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private DTAPMode(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
