package pojoClasses;

public class petStoreUserLibrary {
private int id;
private String username;
private String firstname;
private String lastname;
private String email;
private String password;
private String phone;
private int userStatus;
public petStoreUserLibrary() {}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getUserStatus() {
	return userStatus;
}
public void setUserStatus(int userStatus) {
	this.userStatus = userStatus;
}
public petStoreUserLibrary(int id, String username, String firstname, String lastname, String email, String password,
		String phone, int userStatus) {
	super();
	this.id = id;
	this.username = username;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
	this.phone = phone;
	this.userStatus = userStatus;
}
}
