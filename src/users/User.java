package users;
<<<<<<< Updated upstream
import java.util.ArrayList;

import courses.*;
=======
import courses.Course;
import messages.Message;
>>>>>>> Stashed changes


public class User {
    String name;
    String phoneNumber;
    String email;
	ArrayList<Course> enrolledCourses;
	public ArrayList<Course> getEnrolledCourses() 
	{
		return enrolledCourses;
	}
    public User() {
        name = getName();
        phoneNumber = getPhoneNumber();
        email = getEmail();
    }

    public User(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
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
<<<<<<< Updated upstream
	
	public void getNotified(String msgType,Course course) {
		enrolledCourses.add(course);
		if(msgType == "Email"){
			course.coursePublisher.subscribe("Email", this);
		}
		else if(msgType == "SMS"){
			course.coursePublisher.subscribe("SMS", this);
		}
		else if(msgType == "Both"){
			course.coursePublisher.subscribe("Both", this);
		}
	}
	
    public void update(String message) {
		System.out.println(getName() + ": " +message);
=======

	public void enlistInCourse(String messageType, Course course){
		course.getCoursePublisher().subscribe(messageType,this);
>>>>>>> Stashed changes
	}


	
<<<<<<< Updated upstream
=======
    public void update(Message message) {
		System.out.println(getName() + ": received:" +message.getMessageContent());
	}	
>>>>>>> Stashed changes
}