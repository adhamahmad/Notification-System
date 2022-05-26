package messages;

public class GradesAnnouncementEmailMessage implements IMessage{

    public String prepareMessage(String placeHolders[]) {
        GradeVerifier.verifyGrades();
        placeHolders[0] = "Gardes on Email";
        return placeHolders[0];
    }
}