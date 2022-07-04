package manegeResults;

public class Admin extends User {
	
	String userName;
	String password;
	public Admin(String name, int age, String address, String userName, String password) {
		super(name, age, address);
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
