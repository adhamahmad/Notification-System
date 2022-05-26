package messages;

public class GradesAnnouncementMobileMessage implements IMessage{

	public String prepareMessage(String placeHolders[]) {
		verifyGrades();
		placeHolders[0] = "Grades on SMS";
		return placeHolders[0];
	}
}
