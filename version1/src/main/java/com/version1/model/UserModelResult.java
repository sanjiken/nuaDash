package com.version1.model;

public class UserModelResult {

	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private Boolean isHomme;
	private Boolean isFemme;
	
	public UserModelResult() {
		super();
	}

	public UserModelResult(String firstName, String lastName, String password, String email,
			Boolean isHomme, Boolean isFemme) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.isHomme = isHomme;
		this.isFemme = isFemme;
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

	public Boolean getIsHomme() {
		return isHomme;
	}

	public void setIsDeleted(Boolean isHomme) {
		this.isHomme = isHomme;
	}

	public Boolean getIsFemme() {
		return isFemme;
	}

	public void setIsFemme(Boolean isFemme) {
		this.isFemme = isFemme;
	}

	@Override
	public String toString() {
		return "UserModelResult [firstName=" + firstName + ", lastName=" + lastName +  ", password="
				+ password + ", email=" + email + ", isDeleted=" + isHomme + ", isActivated=" + isFemme + "]";
	}
	
	
	
	
}

