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
    public String getMessageContent() {
        String message ="";
        for(String temp : messageContent){
            message += " "+ temp;
        }
        messageContent.clear();
        return message;
    }
    public void setMessageContent(ArrayList<String> messageContent) {
        this.messageContent = messageContent;
    }
}