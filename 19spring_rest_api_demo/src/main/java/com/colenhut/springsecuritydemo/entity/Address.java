package com.colenhut.springsecuritydemo.entity;

public class Address {
	
	private String stress;
	private String city;
	private String country;
	
	
	public String getStress() {
		return stress;
	}

	public void setStress(String stress) {
		this.stress = stress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address(String stress, String city, String country) {
		super();
		this.stress = stress;
		this.city = city;
		this.country = country;
	}
	
	public Address() {
		
	}
	
	
	
	
}
