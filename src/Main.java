import java.util.ArrayList;
import courses.*;
import users.*;

public class Main{
    public static void main(String args[]) {
        Course SoftwareEvo = new Course();
        Professor Darsh = new Professor("Software Engineering", "June 2009", "Resreach");
        User Omar = new Student(20196075);
        Omar.setName("Omar");
        User Hesha = new Student(20196077);
        Hesha.setName("Hesha");
        Darsh.setCoursesInCharge(SoftwareEvo);
        Omar.enlistInCourse("Email", SoftwareEvo, Omar);
        Hesha.enlistInCourse("Both", SoftwareEvo, Hesha);
        ArrayList<String> message = new ArrayList<String>();
        message.add("Task Added.");
        Darsh.pushTask(SoftwareEvo, message);
    }
}