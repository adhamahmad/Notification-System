package messages;

import java.util.ArrayList;

public  class Message {
    private ArrayList<String> message = new ArrayList<String>();
    public ArrayList<String> prepareMessage(String placeHolders[]){
        for(String temp : placeHolders){
            message.add(temp);
        }
        return message;
    }
    public ArrayList<String> getMessageContent() {
        return message;
    }
    public void setMessageContent(ArrayList<String> messageContent) {
        this.message = messageContent;
    }
}