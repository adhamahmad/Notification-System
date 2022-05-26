package users;

public class Student {
	String name;
	int Id;
	String email;
	String phoneNumber;	
	
	public Student(int id) {
		super();
		Id = id;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}	
}
