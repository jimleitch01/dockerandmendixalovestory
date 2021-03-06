// This file was generated by Mendix Modeler 7.8.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package inspections.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the Inspections module
	public static boolean afterStartup(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "Inspections.AfterStartup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean bCo_Inspection(IContext context, inspections.proxies.Inspection _inspection)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Inspection", _inspection == null ? null : _inspection.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "Inspections.BCo_Inspection", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void finding_Delete(IContext context, inspections.proxies.Finding _finding)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Finding", _finding == null ? null : _finding.getMendixObject());
			Core.execute(context, "Inspections.Finding_Delete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void inspection_MarkAsDone(IContext context, inspections.proxies.Inspection _inspection)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Inspection", _inspection == null ? null : _inspection.getMendixObject());
			Core.execute(context, "Inspections.Inspection_MarkAsDone", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_CreateData(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Inspections.SUB_CreateData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_CreateInspection(IContext context, administration.proxies.Account _inspector, java.lang.String _companyName, java.lang.String _contactPerson, java.lang.String _location)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Inspector", _inspector == null ? null : _inspector.getMendixObject());
			params.put("CompanyName", _companyName);
			params.put("ContactPerson", _contactPerson);
			params.put("Location", _location);
			Core.execute(context, "Inspections.SUB_CreateInspection", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_CreateInspectionItemRandom(IContext context, inspections.proxies.Inspection _inspection, java.lang.String _object)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Inspection", _inspection == null ? null : _inspection.getMendixObject());
			params.put("Object", _object);
			Core.execute(context, "Inspections.SUB_CreateInspectionItemRandom", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}