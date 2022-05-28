package courses;
import java.util.ArrayList;

import messages.IMessage;
import users.User;

public class Course {
	public CoursePublisher coursePublisher;
	String name;
	String code;
	IMessage message;
	ArrayList<String[]> announcements;
	ArrayList<String[]> tasks;
	ArrayList<String[]> grades;

	public CoursePublisher getCoursePublisher() 
	{
		return coursePublisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void addTask(String[] task) {
		tasks.add(task);
		message = new taskMessage();
		message.setContent(task);
		coursePublisher.notify(message);
	}

	public void postGrades(String[] grade) {
		grades.add(grade);
		message = new gradesMessage();
		message.setContent(grade);
		coursePublisher.notify(message);
	}

	public void postAnnouncement(String [] announcement) {
		announcements.add(announcement);
		message = new announcementMessage();
		message.setContent(announcement);
		coursePublisher.notify(message);
	}



}
