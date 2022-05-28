package gateways;

import messages.Message;
import users.User;

public class EmailGateway implements IGateway{

	@Override
	public void sendMessage(IMessage message, String user, String contents) {
		// TODO Auto-generated method stub
		String[] placeHolders = new String[] {};
		message.prepareMessage(placeHolders);
		contents = placeHolders[0] + " " + contents;
	}

	
}
