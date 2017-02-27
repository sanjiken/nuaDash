package com.version1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "UserEntity")
public class UserEntity {

private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="hibernate_sequence1")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="hibernate_sequence1")  
	private int id;
	
	@Column(name="USER_NAME")
	private String userName;


		@Column(name="PASSOWRD")
	   private String password;
		
		@Column(name="CONF_PASSOWRD")
		   private String confPassword;
	
	@Column(name="EMAIL")
	private String email;
	
	

	
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the firstName
	 */
	
}
