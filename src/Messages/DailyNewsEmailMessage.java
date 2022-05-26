package messages;

public class DailyNewsEmailMessage implements IMessage{
	
	public String prepareMessage(String placeHolders[]) {
		placeHolders[0] = "Today's news on Email";
		return placeHolders[0];
	}
}
