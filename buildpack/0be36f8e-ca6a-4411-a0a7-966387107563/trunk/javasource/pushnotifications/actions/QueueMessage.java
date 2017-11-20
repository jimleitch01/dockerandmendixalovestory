// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package pushnotifications.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import static pushnotifications.proxies.microflows.Microflows.createAndQueueMessage;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Replaces microflow 'SendMessageQueued'.
 * Parameters: 
 * Device: Android or iOS
 * MessageText: the contents of the message
 * Title: The title of the message
 * Badge: a number that appears on the app icon (iOS)
 * LaunchImage: file name of the launch image (iOS)
 * Sound: name of system sound to play (iOS)
 * 
 */
public class QueueMessage extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __DeviceParameter1;
	private pushnotifications.proxies.Device DeviceParameter1;
	private java.lang.String MessageText;
	private java.lang.String Title;
	private java.lang.Long Badge;
	private java.lang.String LaunchImage;
	private java.lang.String Sound;
	private java.lang.Long TimeToLive;

	public QueueMessage(IContext context, IMendixObject DeviceParameter1, java.lang.String MessageText, java.lang.String Title, java.lang.Long Badge, java.lang.String LaunchImage, java.lang.String Sound, java.lang.Long TimeToLive)
	{
		super(context);
		this.__DeviceParameter1 = DeviceParameter1;
		this.MessageText = MessageText;
		this.Title = Title;
		this.Badge = Badge;
		this.LaunchImage = LaunchImage;
		this.Sound = Sound;
		this.TimeToLive = TimeToLive;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.DeviceParameter1 = __DeviceParameter1 == null ? null : pushnotifications.proxies.Device.initialize(getContext(), __DeviceParameter1);

		// BEGIN USER CODE
		createAndQueueMessage(getContext(), DeviceParameter1, MessageText, Title, Badge, LaunchImage, Sound, TimeToLive);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "QueueMessage";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
