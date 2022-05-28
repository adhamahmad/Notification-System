package messages;

public abstract class Message {
    private String[] message = new String[];
    public abstract String prepareMessage(String placeHolders[]){
        for(String temp: placeHolders) {
        int i = 0;
        messageContent[messageContent.length]= messageContent[i];
        messageContent[i] = temp;
        }
    }
    public String[] getMessageContent() {
        return message;
    }
    public void setMessageContent(String[] messageContent) {
        this.message = messageContent;
    }
}