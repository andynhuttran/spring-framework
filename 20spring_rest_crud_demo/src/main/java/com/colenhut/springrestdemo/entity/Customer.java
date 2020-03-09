package com.colenhut.springrestdemo.entity;

public class Customer {
	
	private int Id;
	private String name;
	private int age;
	private boolean sex;
	
	
	public Customer() {		
	}
	
	
	public Customer(int Id, String name, int age, boolean sex) {
		this.Id = Id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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
	
	public boolean isSex() {
		return sex;
	}
	
	public void setSex(boolean sex) {
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
	
}
