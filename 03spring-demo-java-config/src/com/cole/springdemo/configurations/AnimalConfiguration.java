package com.cole.springdemo.configurations;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cole.springdemo.objects.ElephalAnimal;
import com.cole.springdemo.objects.MonkeyAnimal;

@Configuration
public class AnimalConfiguration {
	
	@Bean("elephant-animal")
	public ElephalAnimal getElephant() {
		return new ElephalAnimal();
	}
	
	@Bean
	public int magicNumber() {
		Random random = new Random();
		return random.nextInt(3);
	}
	
	@Bean
	public MonkeyAnimal getMonkeyAnimal() {
		return new MonkeyAnimal();
	}
	
	@Bean
	public String GetSomething() {
		return "something";
	}
	
	
}



