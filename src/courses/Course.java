package courses;
import java.util.ArrayList;

public class Course {
	CoursePublisher coursePublisher;
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	ArrayList<String> assignments; // added

	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<String>();
		exams = new ArrayList<String>();
		grades = new ArrayList<String>();
		assignments = new ArrayList<String>();
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

	public void addAssignment(String assignName, String assignBody) {
		assignments.add(assignName);
		assignments.add(assignBody);
		String content = assignName + assignBody;
		coursePublisher.notify( ,content);
	}

	public void addExam(String examName, String examBody) {
		exams.add(examName);
		exams.add(examBody);
	}

	public void postGrades(String gradedItem, String gradeValue) {
		grades.add(gradedItem);
		grades.add(gradeValue);
	}

	public void postAnnouncement(String announcementContent) {
		announcements.add(announcementContent);

	}



}
