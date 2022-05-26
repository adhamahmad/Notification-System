package gateways;

import messages.DailyNewsMobileMessage;
import messages.GradesAnnouncementMobileMessage;
import messages.TaskAddedMobileMessage;

public class SMSGateway implements IGateway{

	public void sendMessage(Message message, String user, String contents) {
		String[] placeHolders = new String[] {};
		message.prepareMessage(placeHolders);
		contents = placeHolders[0] + " " + contents;

	}
}
