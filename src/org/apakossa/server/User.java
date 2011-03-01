package org.apakossa.server;

public class User {
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private String adress;
	private String postalCode;
	private String country;
	
	public User(String email, String password, String firstname, String lastname, String adress, String postalCode, String country) {
		this.email = email;
		//TODO add password hash, preferably SHA256
		this.password = password;
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.adress = adress;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		//TODO add password hash
		this.password = password;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getAdress() {
		return this.adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getPostalCode() {
		return this.postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
}
