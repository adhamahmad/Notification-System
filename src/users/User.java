package users;
import courses.Course;
import messages.Message;


public class User {
    String name;
    String phoneNumber;
    String email;

    public User(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

	public User() {
	}

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void enlistInCourse(String messageType, Course course, User enlister){
		course.getCoursePublisher().subscribe(messageType, enlister);
	}
	
    public void update(Message message) {
		System.out.println(getName() + " received:" +message.getMessageContent());
	}	
}