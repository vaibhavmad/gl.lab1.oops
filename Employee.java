package LAB1;

public class Employee {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	

	public Employee(String firstName, String lastName) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	
	}
	
	public void setEmail(String email) {
		this.email = email;
		
	}

	public void setPassword(String password) {
		this.password = password;
		
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}
