package com.cole.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cole.springdemo.configurations.AnimalConfiguration;
import com.cole.springdemo.objects.Animal;


/**
 * @author cole
 * This example shows how to get bean from java class with limited annotation and without xml file
 * 
 * AnnotationConfigApplicationContext class is used to load configuration, then get bean as usual.
 * 
 */

public class JavaConfigMainApp {

	public static void main(String[] args) {
		
		//load spring configuration
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AnimalConfiguration.class);
		
		//get bean from spring container
		Animal animal = ctx.getBean("elephant-animal", Animal.class);		
		System.out.println(animal.getName());
		
		//get bean from spring container
		int number = ctx.getBean("magicNumber", Integer.class);		
		System.out.println("Number is: " + number);
		
		//get bean from spring container
		animal = ctx.getBean("getMonkeyAnimal", Animal.class);		
		System.out.println(animal.getName());
		
		//get bean from spring container
		String msg = ctx.getBean("GetSomething", String.class);		
		System.out.println(msg);
		
		//close context
		ctx.close();
		
	}
}
