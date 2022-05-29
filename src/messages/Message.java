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
        ArrayList<String> oldMessage = new ArrayList<String>();
        for(String temp : messageContent){
            if(temp.equals(".")){
                oldMessage.add(temp);
                break;
            }
            oldMessage.add(temp);
        }
        this.setMessageContent(oldMessage);
        return message;
    }
    public ArrayList<String> getMessage(){
        return messageContent;
    }
    public void setMessageContent(ArrayList<String> messageContent) {
        this.messageContent = messageContent;
    }

    public void clear(){
        messageContent.clear();
    }
}