package courses;
import java.util.ArrayList;

import messages.taskMessage;
import messages.Message;
import messages.announcmentMessage;
import messages.gradeMessage;

public class Course {
	public CoursePublisher coursePublisher;
	String name;
	String code;
	Message message;
	ArrayList<ArrayList <String>> announcements;
	ArrayList<ArrayList <String>> tasks;
	ArrayList<ArrayList <String>> grades;

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

	public void addTask(ArrayList<String> task) {
		tasks.add(task);
		message = new taskMessage();
		message.setMessageContent(task);
		coursePublisher.notify(message);
	}

	public void postGrades(ArrayList<String> grade) {
		grades.add(grade);
		message = new gradeMessage();
		message.setMessageContent(grade);
		coursePublisher.notify(message);
	}

	public void postAnnouncement(ArrayList<String> announcement) {
		announcements.add(announcement);
		message = new announcmentMessage();
		message.setMessageContent(announcement);
		coursePublisher.notify(message);
	}



}
