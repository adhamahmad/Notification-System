package users;

public class TA extends User{
	String department;

	public TA(String department) {
		super();
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}	
}
