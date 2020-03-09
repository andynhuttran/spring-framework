package com.cole.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cole.springdemo.objects.Animal;

/**
 * 
 * @author cole
 * get bean from component "component-pig" in class PigAnimal
 *  Program starts and scans components from 
 *  pacakge "com.cole.springdemo.objects" defined in applicationContext.xml
 *  
 *  There are components: 
 *  1. component-pig is defined from PigAnimal.java
 *  2. feederHuman is define from FeederHuman.java
 *  3. wifeHuman is define from WifeHuman.java
 *  
 *  Name of component is specified or got from default with Camel rule
 *  
 *  In this example: bean from PigAnimal is defined "component-pig"
 *  beans from FeederHuman or WifeHuman is used by default.
 *  
 */

public class AnnotationMainApp {

	public static void main(String[] args) {
		
		//load xml config
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		Animal pig = ctx.getBean("component-pig", Animal.class);
		
		//call method from bean
		System.out.println(pig.getName());
		
		//get bean by default ID
		//Animal animal = ctx.getBean("mouseAnimal", Animal.class);
		//System.out.println(animal.getName());
		
		//close context
		ctx.close();

	}

}
