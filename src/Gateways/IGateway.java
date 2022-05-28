package gateways;

import messages.*;
import users.User;

public interface IGateway {

    void sendMessage(IMessage message, String user, String contents);

}