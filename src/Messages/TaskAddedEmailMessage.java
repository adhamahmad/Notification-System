package messages;

public class TaskAddedEmailMessage implements IMessage{

	public String prepareMessage(String placeHolders[]) {
		addTeamDescription();
		placeHolders[0] = "Today's task on Email";
		return placeHolders[0];
	}
}
