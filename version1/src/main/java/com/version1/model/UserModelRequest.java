package com.version1.model;

public class UserModelRequest {

	private String firstName;
	private String lastName;
	private String login;
	private String password;
	private String email;
	private Boolean isDeleted;
	private Boolean isActivated;
	
	public UserModelRequest() {
		super();
	}

	public UserModelRequest(String firstName, String lastName, String login, String password, String email,
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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
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
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	/**
	 * @return the isActivated
	 */
	public Boolean getIsActivated() {
		return isActivated;
	}

	/**
	 * @param isActivated the isActivated to set
	 */
	public void setIsActivated(Boolean isActivated) {
		this.isActivated = isActivated;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserModelRequest [firstName=" + firstName + ", lastName=" + lastName + ", login=" + login
				+ ", password=" + password + ", email=" + email + ", isDeleted=" + isDeleted + ", isActivated="
				+ isActivated + "]";
	}
	
	
	
}
