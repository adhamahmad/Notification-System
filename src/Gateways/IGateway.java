package gateways;

public interface IGateway {

    void sendMessage(Object message, String user, String contents);

}