package com.colenhut.springmvcdemo.controllers;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public String processStudent(Model model, 
			@Valid @ModelAttribute("student") Student theStudent,
			BindingResult bindingResult
			) {
		
		if (bindingResult.hasErrors()) { //return to another form if there is an error
			return "student-view";
		}
		
		model.addAttribute("msg", theStudent.toString());
		model.addAttribute("std", theStudent);
		
		return "student-confirm";
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		//handle all string them trim it before pass value to controller
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);		
	}
	
}














