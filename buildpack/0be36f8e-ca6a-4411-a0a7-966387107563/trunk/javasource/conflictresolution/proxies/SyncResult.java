// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package conflictresolution.proxies;

public class SyncResult
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject syncResultMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ConflictResolution.SyncResult";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Commit("Commit"),
		Conflict("Conflict"),
		SyncResult_DiscardedSyncObject("ConflictResolution.SyncResult_DiscardedSyncObject");

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

	public SyncResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ConflictResolution.SyncResult"));
	}

	protected SyncResult(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject syncResultMendixObject)
	{
		if (syncResultMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ConflictResolution.SyncResult", syncResultMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ConflictResolution.SyncResult");

		this.syncResultMendixObject = syncResultMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SyncResult.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static conflictresolution.proxies.SyncResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return conflictresolution.proxies.SyncResult.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static conflictresolution.proxies.SyncResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new conflictresolution.proxies.SyncResult(context, mendixObject);
	}

	public static conflictresolution.proxies.SyncResult load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return conflictresolution.proxies.SyncResult.initialize(context, mendixObject);
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
	 * @return value of Commit
	 */
	public final java.lang.Boolean getCommit()
	{
		return getCommit(getContext());
	}

	/**
	 * @param context
	 * @return value of Commit
	 */
	public final java.lang.Boolean getCommit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Commit.toString());
	}

	/**
	 * Set value of Commit
	 * @param commit
	 */
	public final void setCommit(java.lang.Boolean commit)
	{
		setCommit(getContext(), commit);
	}

	/**
	 * Set value of Commit
	 * @param context
	 * @param commit
	 */
	public final void setCommit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean commit)
	{
		getMendixObject().setValue(context, MemberNames.Commit.toString(), commit);
	}

	/**
	 * @return value of Conflict
	 */
	public final java.lang.Boolean getConflict()
	{
		return getConflict(getContext());
	}

	/**
	 * @param context
	 * @return value of Conflict
	 */
	public final java.lang.Boolean getConflict(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Conflict.toString());
	}

	/**
	 * Set value of Conflict
	 * @param conflict
	 */
	public final void setConflict(java.lang.Boolean conflict)
	{
		setConflict(getContext(), conflict);
	}

	/**
	 * Set value of Conflict
	 * @param context
	 * @param conflict
	 */
	public final void setConflict(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean conflict)
	{
		getMendixObject().setValue(context, MemberNames.Conflict.toString(), conflict);
	}

	/**
	 * @return value of SyncResult_DiscardedSyncObject
	 */
	public final conflictresolution.proxies.SyncObject getSyncResult_DiscardedSyncObject() throws com.mendix.core.CoreException
	{
		return getSyncResult_DiscardedSyncObject(getContext());
	}

	/**
	 * @param context
	 * @return value of SyncResult_DiscardedSyncObject
	 */
	public final conflictresolution.proxies.SyncObject getSyncResult_DiscardedSyncObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		conflictresolution.proxies.SyncObject result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SyncResult_DiscardedSyncObject.toString());
		if (identifier != null)
			result = conflictresolution.proxies.SyncObject.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SyncResult_DiscardedSyncObject
	 * @param syncresult_discardedsyncobject
	 */
	public final void setSyncResult_DiscardedSyncObject(conflictresolution.proxies.SyncObject syncresult_discardedsyncobject)
	{
		setSyncResult_DiscardedSyncObject(getContext(), syncresult_discardedsyncobject);
	}

	/**
	 * Set value of SyncResult_DiscardedSyncObject
	 * @param context
	 * @param syncresult_discardedsyncobject
	 */
	public final void setSyncResult_DiscardedSyncObject(com.mendix.systemwideinterfaces.core.IContext context, conflictresolution.proxies.SyncObject syncresult_discardedsyncobject)
	{
		if (syncresult_discardedsyncobject == null)
			getMendixObject().setValue(context, MemberNames.SyncResult_DiscardedSyncObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SyncResult_DiscardedSyncObject.toString(), syncresult_discardedsyncobject.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return syncResultMendixObject;
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
			final conflictresolution.proxies.SyncResult that = (conflictresolution.proxies.SyncResult) obj;
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
		return "ConflictResolution.SyncResult";
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
