package messages;

public class GradesAnnouncementMobileMessage implements IMessage{

	public String prepareMessage(String placeHolders[]) {
		GradeVerifier.verifyGrades();
		placeHolders[0] = "Grades on SMS";
		return placeHolders[0];
	}
}
