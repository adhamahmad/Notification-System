package gateways;

import messages.*;

public interface IGateway {

    public void sendMessage(User recepient, Message message);

}