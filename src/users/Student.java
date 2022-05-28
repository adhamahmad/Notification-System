package users;

public class Student extends User{
	String name;
	int Id;
	String email;
	String phoneNumber;	
	
	public Student(int id) {
		Id = id;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}	
}
