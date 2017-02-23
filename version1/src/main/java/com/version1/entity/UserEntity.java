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
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PASSOWRD")
	private String password;
	
	@Column(name="DATE_NESS")
	private String dateNess;
	
	
	@Column(name="IS_HOMME")
	private Boolean isHomme;
	
	@Column(name="IS_FEMME")
	private Boolean isFemme;

	
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the isHomme
	 */
	public Boolean getIsHomme() {
		return isHomme;
	}

	/**
	 * @param isFemme the isHemme to set
	 */
	
	public void setIsHomme(Boolean isHomme) {
		this.isHomme = isHomme;
	}

	/**
	 * @return the isFemme
	 */
	public Boolean getIsFemme() {
		return isFemme;
	}

	/**
	 * @param isFemme theisHemme to set
	 */
	public void setIsFemme(Boolean isFemme) {
		this.isFemme = isFemme;
	}
	
	
	
	
}
