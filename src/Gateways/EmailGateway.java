package gateways;

import messages.DailyNewsEmailMessage;
import messages.GradesAnnouncementEmailMessage;
import messages.TaskAddedEmailMessage;

public class EmailGateway implements IGateway{

	public void sendMessage(Message message, String user, String contents) {
		String[] placeHolders = new String[] {};
		message.prepareMessage(placeHolders);
		contents = placeHolders[0] + " " + contents;
	}
}
