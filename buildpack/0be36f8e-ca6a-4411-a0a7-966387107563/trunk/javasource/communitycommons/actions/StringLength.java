// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Returns -1 if the value is empty, the length otherwise.
 * 
 * DEPRECATED: The length() function is preferred. (See: https://world.mendix.com/display/NRG/String+function+calls)
 */
public class StringLength extends CustomJavaAction<java.lang.Long>
{
	private java.lang.String value;

	public StringLength(IContext context, java.lang.String value)
	{
		super(context);
		this.value = value;
	}

	@Override
	public java.lang.Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		if (this.value == null)
			return -1L;
		return Long.valueOf(this.value.length());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "StringLength";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
