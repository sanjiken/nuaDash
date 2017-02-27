package com.version1.model;

public class ModelRequestUp  {

	

	private String  userName;

	private String password;
	private String confPassword;
	private String email;


	public ModelRequestUp() {
		super();
	}
	

	public ModelRequestUp(String userName, String password,String confPassword ,String email ) {
		super();
		this.userName = userName;
		this.password = password;
		this.confPassword = confPassword;
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfPassword() {
		return confPassword;
	}


	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


}