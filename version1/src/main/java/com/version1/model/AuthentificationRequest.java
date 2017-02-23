package com.version1.model;

public class AuthentificationRequest  {

	

	private String  mail;

	private String password;

	public AuthentificationRequest() {
		super();
	}
	

	public AuthentificationRequest(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "AuthentificationRequest [mail=" + mail + ", password=" + password + "]";
	}
	
	
	
	
}
