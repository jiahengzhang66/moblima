package moblima;

public class Employee {
	private String user;
	private String password;
	private String name;
	
	public Employee(String user, String password, String name) {
		this.user = user;
		this.password = password;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	public String getUser() {
		return this.user;
	}
	public String getPassword() {
		return this.password;
	}
	
}
