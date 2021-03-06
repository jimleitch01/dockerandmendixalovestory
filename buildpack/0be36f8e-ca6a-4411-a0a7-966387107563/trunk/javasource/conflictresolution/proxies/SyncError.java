// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package conflictresolution.proxies;

public class SyncError
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject syncErrorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ConflictResolution.SyncError";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Message("Message"),
		SyncError_SyncObject("ConflictResolution.SyncError_SyncObject"),
		SyncError_User("ConflictResolution.SyncError_User");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SyncError(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ConflictResolution.SyncError"));
	}

	protected SyncError(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject syncErrorMendixObject)
	{
		if (syncErrorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ConflictResolution.SyncError", syncErrorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ConflictResolution.SyncError");

		this.syncErrorMendixObject = syncErrorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SyncError.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static conflictresolution.proxies.SyncError initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return conflictresolution.proxies.SyncError.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static conflictresolution.proxies.SyncError initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new conflictresolution.proxies.SyncError(context, mendixObject);
	}

	public static conflictresolution.proxies.SyncError load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return conflictresolution.proxies.SyncError.initialize(context, mendixObject);
	}

	public static java.util.List<conflictresolution.proxies.SyncError> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<conflictresolution.proxies.SyncError> result = new java.util.ArrayList<conflictresolution.proxies.SyncError>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ConflictResolution.SyncError" + xpathConstraint))
			result.add(conflictresolution.proxies.SyncError.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Message
	 */
	public final java.lang.String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final java.lang.String getMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(java.lang.String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * @return value of SyncError_SyncObject
	 */
	public final conflictresolution.proxies.SyncObject getSyncError_SyncObject() throws com.mendix.core.CoreException
	{
		return getSyncError_SyncObject(getContext());
	}

	/**
	 * @param context
	 * @return value of SyncError_SyncObject
	 */
	public final conflictresolution.proxies.SyncObject getSyncError_SyncObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		conflictresolution.proxies.SyncObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SyncError_SyncObject.toString());
		if (identifier != null)
			result = conflictresolution.proxies.SyncObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SyncError_SyncObject
	 * @param syncerror_syncobject
	 */
	public final void setSyncError_SyncObject(conflictresolution.proxies.SyncObject syncerror_syncobject)
	{
		setSyncError_SyncObject(getContext(), syncerror_syncobject);
	}

	/**
	 * Set value of SyncError_SyncObject
	 * @param context
	 * @param syncerror_syncobject
	 */
	public final void setSyncError_SyncObject(com.mendix.systemwideinterfaces.core.IContext context, conflictresolution.proxies.SyncObject syncerror_syncobject)
	{
		if (syncerror_syncobject == null)
			getMendixObject().setValue(context, MemberNames.SyncError_SyncObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SyncError_SyncObject.toString(), syncerror_syncobject.getMendixObject().getId());
	}

	/**
	 * @return value of SyncError_User
	 */
	public final system.proxies.User getSyncError_User() throws com.mendix.core.CoreException
	{
		return getSyncError_User(getContext());
	}

	/**
	 * @param context
	 * @return value of SyncError_User
	 */
	public final system.proxies.User getSyncError_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SyncError_User.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SyncError_User
	 * @param syncerror_user
	 */
	public final void setSyncError_User(system.proxies.User syncerror_user)
	{
		setSyncError_User(getContext(), syncerror_user);
	}

	/**
	 * Set value of SyncError_User
	 * @param context
	 * @param syncerror_user
	 */
	public final void setSyncError_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User syncerror_user)
	{
		if (syncerror_user == null)
			getMendixObject().setValue(context, MemberNames.SyncError_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SyncError_User.toString(), syncerror_user.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return syncErrorMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final conflictresolution.proxies.SyncError that = (conflictresolution.proxies.SyncError) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ConflictResolution.SyncError";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
