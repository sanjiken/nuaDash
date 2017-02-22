package com.version1.model;

public class UserModelResult {

	private String firstName;
	private String lastName;
	private String login;
	private String password;
	private String email;
	private Boolean isDeleted;
	private Boolean isActivated;
	
	public UserModelResult() {
		super();
	}

	public UserModelResult(String firstName, String lastName, String login, String password, String email,
			Boolean isDeleted, Boolean isActivated) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.email = email;
		this.isDeleted = isDeleted;
		this.isActivated = isActivated;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Boolean getIsActivated() {
		return isActivated;
	}

	public void setIsActivated(Boolean isActivated) {
		this.isActivated = isActivated;
	}

	@Override
	public String toString() {
		return "UserModelResult [firstName=" + firstName + ", lastName=" + lastName + ", login=" + login + ", password="
				+ password + ", email=" + email + ", isDeleted=" + isDeleted + ", isActivated=" + isActivated + "]";
	}
	
	
	
	
}
