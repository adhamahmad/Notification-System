package users;

import java.sql.Date;
import courses.Course;

public class Professor extends User{
	String department;
	Date hirringDate;
	String PhDTopic;
	Course coursesInCharge[]  = new Course[10];	
	
	public Professor( String department, Date hirringDate, String phDTopic) {
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
	public Date getHirringDate() {
		return hirringDate;
	}
	public void setHirringDate(Date hirringDate) {
		this.hirringDate = hirringDate;
	}
	public String getPhDTopic() {
		return PhDTopic;
	}
	public void setPhDTopic(String phDTopic) {
		PhDTopic = phDTopic;
	}	
}
