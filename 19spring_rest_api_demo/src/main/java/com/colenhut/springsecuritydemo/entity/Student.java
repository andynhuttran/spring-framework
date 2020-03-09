package com.colenhut.springsecuritydemo.entity;

public class Student {
	
	private String name;
	private int age;
	private boolean male;
	private Address address;
	
	public Student() {
		
	}

	
	public Student(String name, int age, boolean male) {		
		this.name = name;
		this.age = age;
		this.male = male;
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


	public boolean isMale() {
		return male;
	}


	public void setMale(boolean male) {
		this.male = male;
	}
	
	public boolean setMale() {
		return male;
	}


	public void getMale(boolean male) {
		this.male = male;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
