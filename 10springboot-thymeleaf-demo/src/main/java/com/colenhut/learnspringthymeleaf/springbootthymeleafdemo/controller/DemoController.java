package com.colenhut.learnspringthymeleaf.springbootthymeleafdemo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	//create a mapping for /hello
	@GetMapping("/hello")
	public String sayHello(Model model) {
		
		model.addAttribute("theDate", new Date());		
		
		return "helloworld";
	}
	
}
