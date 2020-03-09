package com.colenhut.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;

import com.colenhut.springmvcdemo.entity.Student;

public class StudentDAO {
	
	public List<Student> findAllStudent(){
		
		List<Student> list = new ArrayList<Student>();
		
		Student student1 = new Student("Andy", 32);
		Student student2 = new Student("Bella", 31);
		Student student3 = new Student("Cole", 25);
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		return list;		
	}
	
	
	public Student getRandomStudent(){
		return new Student("Cole", 32);
	}
	
}
