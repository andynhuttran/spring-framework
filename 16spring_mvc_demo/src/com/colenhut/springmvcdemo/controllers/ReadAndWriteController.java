package com.colenhut.springmvcdemo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReadAndWriteController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "input-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("name");
		name = name.toUpperCase();
		
		String result = name + " Yola! " + System.currentTimeMillis();
		
		model.addAttribute("msg", result);
		
		return "display-form";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(
			@RequestParam("name") String name, 
			Model model) {
		
		name = name.toUpperCase();
		
		String result = name + " Leuleu**! ";
		
		model.addAttribute("msg", result);
		
		return "display-form";
	}
	
}


















