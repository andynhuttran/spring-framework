package com.colenhut.springmvcdemo.entity;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	
	@NotNull(message = "name is required")
	@Size(min = 3, max = 10, message = "length of name is from 3 to 10")
	private String name;
	
	@Min(value = 18, message = "student is too young, less than 18")
	@Max(value = 100, message = "student is too old, more than 100")
	private int age;
	
	private String country;
	
	private Map<String, String> optionCountries = new HashMap<>();
	
	@NotNull(message = "you have to to choise one programming language")
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

