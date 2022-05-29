package gateways;

import messages.Message;
import users.User;

public class EmailGateway implements IGateway{

    @Override
    public void sendMessage(User recepient, Message message) {
        String[] placeHolders = new String[] {"", "", "", "", ""};
        placeHolders[0] = "This is an Email message";
        message.prepareMessage(placeHolders);
        recepient.update(message);
        }
    }


