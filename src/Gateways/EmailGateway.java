package gateways;

import messages.Message;
import users.User;

public class EmailGateway implements IGateway{

    @Override
    public void sendMessage(User recepient, Message message) {
        String[] placeHolders = new String[] {};
        placeHolders[0] = "this is a sms messageA";
        message.prepareMessage(placeHolders);
        recepient.update(message);
    }


}