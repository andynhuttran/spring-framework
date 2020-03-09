package com.cole.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cole.springdemo.objects.Animal;

public class XmlConfigMainApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		
		ClassPathXmlApplicationContext ctx = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
				
		//retrieve bean from spring container
		Animal myAnimal = ctx.getBean("anAnimal", Animal.class);
		
		//call method on the bean
		System.out.println(myAnimal.getName());
		
		
		//retrieve bean from spring container
		Animal cat = ctx.getBean("aCat", Animal.class);					
		System.out.println(cat.getName());
		
		Animal dog = ctx.getBean("aDog", Animal.class);					
		System.out.println(dog.getName());
		
		//close context
		ctx.close();
		

	}

}
