package com.smscole.springboot.demo.springbootfirstproject.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	
	@GetMapping("/")
	public String sayHello() {
		return "Hello world, the server time is " + LocalDateTime.now();
	}
	
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	@GetMapping("/java")
	public String getDailyJava() {
		return "Do a daily practise Java with luv2code";
	}
	
}
