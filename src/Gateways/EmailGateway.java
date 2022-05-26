package gateways;

import messages.DailyNewsEmailMessage;
import messages.GradesAnnouncementEmailMessage;
import messages.IMessage;
import messages.TaskAddedEmailMessage;

public class EmailGateway implements IGateway{

	@Override
	public void sendMessage(IMessage message, String user, String contents) {
		// TODO Auto-generated method stub
		String[] placeHolders = new String[] {};
		message.prepareMessage(placeHolders);
		contents = placeHolders[0] + " " + contents;
	}

	
}
