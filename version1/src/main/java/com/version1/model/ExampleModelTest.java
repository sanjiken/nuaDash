package com.version1.model;

public class ExampleModelTest {

	private String nom;
	private String prenom;
	private String phone;
	private Integer cin;
	
	public ExampleModelTest() {
		super();
	}

	public ExampleModelTest(String nom, String prenom, String phone, Integer cin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.phone = phone;
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getCin() {
		return cin;
	}

	public void setCin(Integer cin) {
		this.cin = cin;
	}

	
	

	
	
	
}
