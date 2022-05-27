package courses;
import java.util.ArrayList;

import messages.IMessage;
import users.User;

public class Course {
	public CoursePublisher coursePublisher;
	String name;
	String code;
	IMessage message;
	ArrayList<String> announcements;
	ArrayList<String> tasks;
	ArrayList<String> grades;

	
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

	public void addTask(String examName, String examBody) {
		tasks.add(examName);
		tasks.add(examBody);
		message = new taskMessage();
		message.setContent(examName+examBody);
		coursePublisher.notify(message);
	}

	public void postGrades(String gradedItem, String gradeValue) {
		grades.add(gradedItem);
		grades.add(gradeValue);
		message = new gradesMessage();
		message.setContent(gradedItem+gradeValue);
		coursePublisher.notify(message);
	}

	public void postAnnouncement(String announcementContent) {
		announcements.add(announcementContent);
		message = new announcementMessage();
		message.setContent(announcementContent);
		coursePublisher.notify(message);
	}



}
