// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package inspections.proxies;

public class InspectionItem
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject inspectionItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Inspections.InspectionItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		InspectionItem_Inspection("Inspections.InspectionItem_Inspection");

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

	public InspectionItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Inspections.InspectionItem"));
	}

	protected InspectionItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject inspectionItemMendixObject)
	{
		if (inspectionItemMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Inspections.InspectionItem", inspectionItemMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Inspections.InspectionItem");

		this.inspectionItemMendixObject = inspectionItemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'InspectionItem.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static inspections.proxies.InspectionItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return inspections.proxies.InspectionItem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static inspections.proxies.InspectionItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new inspections.proxies.InspectionItem(context, mendixObject);
	}

	public static inspections.proxies.InspectionItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return inspections.proxies.InspectionItem.initialize(context, mendixObject);
	}

	public static java.util.List<inspections.proxies.InspectionItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<inspections.proxies.InspectionItem> result = new java.util.ArrayList<inspections.proxies.InspectionItem>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Inspections.InspectionItem" + xpathConstraint))
			result.add(inspections.proxies.InspectionItem.initialize(context, obj));
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of InspectionItem_Inspection
	 */
	public final inspections.proxies.Inspection getInspectionItem_Inspection() throws com.mendix.core.CoreException
	{
		return getInspectionItem_Inspection(getContext());
	}

	/**
	 * @param context
	 * @return value of InspectionItem_Inspection
	 */
	public final inspections.proxies.Inspection getInspectionItem_Inspection(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		inspections.proxies.Inspection result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InspectionItem_Inspection.toString());
		if (identifier != null)
			result = inspections.proxies.Inspection.load(context, identifier);
		return result;
	}

	/**
	 * Set value of InspectionItem_Inspection
	 * @param inspectionitem_inspection
	 */
	public final void setInspectionItem_Inspection(inspections.proxies.Inspection inspectionitem_inspection)
	{
		setInspectionItem_Inspection(getContext(), inspectionitem_inspection);
	}

	/**
	 * Set value of InspectionItem_Inspection
	 * @param context
	 * @param inspectionitem_inspection
	 */
	public final void setInspectionItem_Inspection(com.mendix.systemwideinterfaces.core.IContext context, inspections.proxies.Inspection inspectionitem_inspection)
	{
		if (inspectionitem_inspection == null)
			getMendixObject().setValue(context, MemberNames.InspectionItem_Inspection.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.InspectionItem_Inspection.toString(), inspectionitem_inspection.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return inspectionItemMendixObject;
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
			final inspections.proxies.InspectionItem that = (inspections.proxies.InspectionItem) obj;
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
		return "Inspections.InspectionItem";
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
