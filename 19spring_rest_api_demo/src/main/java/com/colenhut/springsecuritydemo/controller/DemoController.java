package com.colenhut.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("demo")
public class DemoController {
	
	@RequestMapping(path = "/read/{name}", method = RequestMethod.GET)
	public String sayHello(@PathVariable String name, Model model) {
		String msg = "Hello " + name.toUpperCase() + ", how are you today?";
		model.addAttribute("msg", msg);
		
		return "demo";
	}
	
}
