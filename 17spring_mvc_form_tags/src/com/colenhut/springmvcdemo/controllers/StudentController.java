package com.colenhut.springmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.colenhut.springmvcdemo.dao.StudentDAO;
import com.colenhut.springmvcdemo.entity.Student;

@Controller
@RequestMapping("students")
public class StudentController {

	
	@RequestMapping("/random")
	public String getStudent(Model model) {
		
		StudentDAO dao = new StudentDAO();		
		Student student = dao.getRandomStudent();
		
		model.addAttribute("student", student);
		
		return "student-view";
	}
	
	
	@RequestMapping("/process-student")
	public String processStudent(Model model, @ModelAttribute("student") Student theStudent) {
		
		model.addAttribute("msg", theStudent.toString());
		model.addAttribute("std", theStudent);
		
		return "student-confirm";
	}
	
}
