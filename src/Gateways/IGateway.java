package gateways;

import messages.*;
import users.User;

public interface IGateway {

    public void sendMessage(User recepient, Message message);

}