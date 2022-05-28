package courses;
import java.util.ArrayList;

import messages.Message;
import messages.AnnouncementMessage;
import messages.GradeMessage;
import messages.TaskMessage;

public class Course {
	public CoursePublisher coursePublisher;
	String name;
	String code;
	Message message;
	ArrayList<ArrayList<String>> announcements;
	ArrayList<ArrayList<String>> tasks;
	ArrayList<ArrayList<String>> grades;

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
		message = new TaskMessage();
		message.setMessageContent(task);
		coursePublisher.notify(message);
	}

	public void postGrades(ArrayList<String> grade) {
		grades.add(grade);
		message = new GradeMessage();
		message.setMessageContent(grade);
		coursePublisher.notify(message);
	}

	public void postAnnouncement(ArrayList<String> announcement) {
		announcements.add(announcement);
		message = new AnnouncementMessage();
		message.setMessageContent(announcement);
		coursePublisher.notify(message);
	}



}
