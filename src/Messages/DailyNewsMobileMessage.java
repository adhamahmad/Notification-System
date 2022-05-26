package messages;

public class DailyNewsMobileMessage implements IMessage{

    public String prepareMessage(String placeHolders[]) {
        placeHolders[0] = "Today's news on SMS";
        return placeHolders[0];
    }
}