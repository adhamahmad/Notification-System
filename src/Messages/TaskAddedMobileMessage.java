package messages;

public class TaskAddedMobileMessage implements IMessage{

	public String prepareMessage(String placeHolders[]) {
		addTeamDescription();
		placeHolders[0] = "Today's task on SMS";
		return placeHolders[0];
	}
}