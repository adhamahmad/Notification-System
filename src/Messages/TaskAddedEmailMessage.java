package messages;

public class TaskAddedEmailMessage implements IMessage{

	public String prepareMessage(String placeHolders[]) {
		DescAdder.addTeamDescription();
		placeHolders[0] = "Today's task on Email";
		return placeHolders[0];
	}
}
