package gateways;

import messages.Message;
import users.User;

public class SMSGateway implements IGateway{

    @Override
    public void sendMessage(User recepient, Message message) {
        String[] placeHolders = new String[] {"", "", "", "", ""};
        placeHolders[0] = ".";
        placeHolders[1] = "This is a SMS message.";
        message.prepareMessage(placeHolders);
        recepient.update(message);
    }
}