package net.revature.models;

public class Person {
	// fields
	private int personId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String roleId;
	
	public Person() {
		personId=0;
		username="";
		password="";
		firstName="";
		lastName="";
		roleId="";
	}
	
	public int getId() {
		return personId;
	}

	public void setId(int personId) {
		this.personId = personId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getRoleId() {
		return roleId;
	}
	
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	

}
