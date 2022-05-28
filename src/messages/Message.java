package messages;

import java.util.ArrayList;

public  class Message {
    private ArrayList<String> messageContent = new ArrayList<String>();
    public ArrayList<String> prepareMessage(String placeHolders[]){
        for(String temp : placeHolders){
            messageContent.add(temp);
        }
        return messageContent;
    }
    public ArrayList<String> getMessageContent() {
        return messageContent;
    }
    public void setMessageContent(ArrayList<String> messageContent) {
        this.messageContent = messageContent;
    }
}