package gateways;

import messages.Message;
import users.User;

public class SMSGateway implements IGateway{

    @Override
    public void sendMessage(User recepient, Message message) {
        String[] placeHolders = new String[] {"", "", "", "", ""};
        placeHolders[0] = "This is a SMS message";
        message.prepareMessage(placeHolders);
        recepient.update(message);
        placeHolders[0] = "";
        placeHolders[1] = "";
        placeHolders[2] = "";
        placeHolders[3] = "";
        placeHolders[4] = "";
    }
}