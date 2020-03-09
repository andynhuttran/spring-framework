package com.colenhut.springsecuritydemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colenhut.springsecuritydemo.entity.Address;
import com.colenhut.springsecuritydemo.entity.Student;
import com.colenhut.springsecuritydemo.exception.StudentErrorException;
import com.colenhut.springsecuritydemo.exception.StudentNotFoundException;

@RestController
@RequestMapping("api")
public class RestDemoController {
	
	private List<Student> students;
	
	@PostConstruct
	public void initData() {
		students = new ArrayList<Student>();
		
		Student s1 = new Student("Cole", 32, true);
		s1.setAddress(new Address("LK56", "HCM", "VN"));
		students.add(s1);
		
		
		Student s2 = new Student("Bella", 31, false);
		s2.setAddress(new Address("LTQ", "HCM", "VN"));
		students.add(s2);
		
		Student s3 = new Student("Andy", 32, true);
		students.add(s3);
	}
	
	
	@GetMapping("/students")
	public List<Student> getStudent() {			
		return students;		
	}
	
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {		
		if (id < 0 || id > students.size()) {
			throw new StudentNotFoundException("Could not find student " + id);
		}
		
		return students.get(id);
	}
	
	@DeleteMapping("/students/{id}")
	public Student deleteStudent(@PathVariable int id) {
		if (id < 0 || id > students.size()) {
			throw new StudentNotFoundException("Could not find student " + id);
		}
		
		return students.remove(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

