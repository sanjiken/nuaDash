package com.version1.model;

public class UserModelRequest {

	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private Boolean isFemme;
	private Boolean isHomme;
	
	public UserModelRequest() {
		super();
	}

	public UserModelRequest(String firstName, String lastName, String password, String email,
			Boolean isHomme, Boolean isFemme) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.isHomme = isHomme;
		this.isFemme = isFemme;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the isDeleted
	 */
	public Boolean getIsFemme() {
		return isFemme;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsFemme(Boolean isFemme) {
		this.isFemme = isFemme;
	}

	/**
	 * @return the isActivated
	 */
	public Boolean getIsHomme() {
		return isHomme;
	}

	/**
	 * @param isActivated the isActivated to set
	 */
	public void setIsHomme(Boolean isHomme) {
		this.isHomme = isHomme;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserModelRequest [firstName=" + firstName + ", lastName=" + lastName 
				+ ", password=" + password + ", email=" + email + ", isFemme=" + isFemme + ", isHomme="
				+ isHomme + "]";
	}
	
	
	
}
