package org.apakossa.server;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
		try {
			this.password = stringToSHA(password);
		}
		catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
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
		try {
			this.password = stringToSHA(password);
		}
		catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
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
	
	private String stringToSHA(String input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.reset();
		byte[] buffer = input.getBytes();
		md.update(buffer);
		byte[] digest = md.digest();
	
		String hexStr = "";
		for (int i = 0; i < digest.length; i++) {
			hexStr +=  Integer.toString( ( digest[i] & 0xff ) + 0x100, 16).substring( 1 );
		}
		return hexStr;
	}
}
