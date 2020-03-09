package com.colenhut.springmvcdemo.entity;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	
	private String name;
	private int age;
	
	private String country;
	
	private Map<String, String> optionCountries = new HashMap<>();
	
	
	private String favoriteLanguage;
	
	private String[] operationSystems;
	
	
	public Student() {
		initCountries();
	}
	
	
	private void initCountries() {
		optionCountries.put("VN", "Vietnam");
		optionCountries.put("US", "United State");
		optionCountries.put("CAM", "Cambodia");
		optionCountries.put("THAI", "Thailand");
		optionCountries.put("LAO", "Lao");
	}
	
	public Student(String name, int age) {		
		this.name = name;
		this.age = age;		
		initCountries();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Map<String, String> getOptionCountries() {
		return optionCountries;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public String[] getOperationSystems() {
		return operationSystems;
	}


	public void setOperationSystems(String[] operationSystems) {
		this.operationSystems = operationSystems;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", country=" + country + ", favoriteLanguage="
				+ favoriteLanguage + ", operationSystems=" + operationSystems + "]";
	}
	
	


	
	
	
	

}

