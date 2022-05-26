package gateways;

import messages.*;

public interface IGateway {

    void sendMessage(IMessage message, String user, String contents);

}