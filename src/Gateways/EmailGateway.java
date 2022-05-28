package gateways;

import messages.DailyNewsEmailMessage;
import messages.GradesAnnouncementEmailMessage;
import messages.IMessage;
import messages.TaskAddedEmailMessage;

public class EmailGateway implements IGateway{

	@Override
	public void sendMessage(User recepient, Message message) {
		String[] placeHolders = new String[] {};
		placeHolders[0] = "this is a sms message";
		message.prepareMessage(placeHolders);
		recepient.update(message);
	}


}
