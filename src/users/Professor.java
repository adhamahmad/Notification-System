package users;

import java.util.ArrayList;

import courses.Course;

public class Professor extends User{
	String department;
	String hirringDate;
	String PhDTopic;
	ArrayList<Course> coursesInCharge  = new ArrayList<Course>();
	
	public Professor(String department, String hirringDate, String phDTopic) {
		super();
		this.department = department;
		this.hirringDate = hirringDate;
		PhDTopic = phDTopic;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getHirringDate() {
		return hirringDate;
	}
	public void setHirringDate(String hirringDate) {
		this.hirringDate = hirringDate;
	}
	public String getPhDTopic() {
		return PhDTopic;
	}
	public void setPhDTopic(String phDTopic) {
		PhDTopic = phDTopic;
	}

	public void setCoursesInCharge(Course inCharge){
		coursesInCharge.add(inCharge);
	}

	public void pushTask(Course course, ArrayList<String> message){
		course.addTask(message);
	}

	public void pushGrades(Course course, ArrayList<String> message){
		course.postGrades(message);
	}

	public void pushaAnnouncement(Course course, ArrayList<String> message){
		course.postAnnouncement(message);
	}
}
