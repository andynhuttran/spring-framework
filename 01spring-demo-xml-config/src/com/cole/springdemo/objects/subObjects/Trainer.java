package com.cole.springdemo.objects.subObjects;

public class Trainer {
	
	private String name;
	private int age;
	private int salary;
	
	

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
	
	public int getSalary() {
		return salary;
	}
	
	// init method
	public void buildUpSalary() {
		salary = 10000;
	}
	
	// destroy method
	public void destroySalary() {
		salary = 0;
	}
	
}
