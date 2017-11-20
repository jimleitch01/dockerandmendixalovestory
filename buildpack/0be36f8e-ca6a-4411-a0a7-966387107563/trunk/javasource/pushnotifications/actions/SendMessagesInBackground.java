// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package pushnotifications.actions;

import java.util.LinkedList;
import java.util.List;
import pushnotifications.proxies.AppleMessage;
import pushnotifications.proxies.GoogleMessage;
import pushnotifications.proxies.Message;
import pushnotifications.proxies.constants.Constants;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

public class SendMessagesInBackground extends CustomJavaAction<java.lang.Boolean>
{
	private java.util.List<IMendixObject> __messages;
	private java.util.List<pushnotifications.proxies.Message> messages;

	public SendMessagesInBackground(IContext context, java.util.List<IMendixObject> messages)
	{
		super(context);
		this.__messages = messages;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.messages = new java.util.ArrayList<pushnotifications.proxies.Message>();
		if (__messages != null)
			for (IMendixObject __messagesElement : __messages)
				this.messages.add(pushnotifications.proxies.Message.initialize(getContext(), __messagesElement));

		// BEGIN USER CODE
		ILogNode logger = Core.getLogger(Constants.getLogNode());
		IContext sysContext = Core.createSystemContext();
		List<IMendixObject> appleMessages = new LinkedList<IMendixObject>();
		List<IMendixObject> googleMessages = new LinkedList<IMendixObject>();

		for (Message message : messages) {
			if (message instanceof AppleMessage) {
				appleMessages.add(message.getMendixObject());
			} else if (message instanceof GoogleMessage) {
				googleMessages.add(message.getMendixObject());
			}
		}
		
		try {
			if (appleMessages.size() > 0) {
				Core.executeAsync(sysContext, "PushNotifications.Background_SendAppleMessages",
						appleMessages);
			}
		} catch (Exception e) {
			logger.warn("Background process for Apple messages already running? " + e.toString(), e);
		}
		
		try {
			if (googleMessages.size() > 0) {
				Core.executeAsync(sysContext, "PushNotifications.Background_SendGoogleMessages",
						googleMessages);
			}
		} catch (Exception e) {
			logger.warn("Background process for Google messages already running? " + e.toString(), e);
		}

		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "SendMessagesInBackground";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
