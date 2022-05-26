package users;

public class User {
    String name;
    String phoneNumber;
    String email;

    public User() {
        name = getName();
        phoneNumber = getPhoneNumber();
        email = getEmail();
    }

    public User(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public void update(String message) {
		System.out.println(getName() + ": " +message);
	}
	
}