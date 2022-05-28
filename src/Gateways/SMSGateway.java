package gateways;

import messages.DailyNewsMobileMessage;
import messages.GradesAnnouncementMobileMessage;
import messages.IMessage;
import messages.TaskAddedMobileMessage;

public class SMSGateway implements IGateway{

	@Override
	public void sendMessage(User recepient, Message message) {
		String[] placeHolders = new String[] {};
		placeHolders[0] = "this is a email message";
		message.prepareMessage(placeHolders);
		recepient.update(message);
	}
}
