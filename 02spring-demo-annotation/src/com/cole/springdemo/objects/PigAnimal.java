package com.cole.springdemo.objects;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cole.springdemo.objects.subObjects.Human;



@Component("component-pig")
public class PigAnimal implements Animal {
	
	
	private Human human;
	
	/**
	 * @author cole
	 * @Autowired will find all Human objects to assign to humans parameters
	 * In this case, we have two components which is instance of Human in package subObjects 
	 */
	@Autowired
	public PigAnimal(List<Human> humans) {
		System.out.println(">> PigAnimal: inside PigAnimal");
		this.human = humans.get(0);
		this.human.work();
	}
	
	/**
	 * @author cole
	 * @Autowired will find an object to assign to wifeHuman parameters with the same component name
	 */
	@Autowired
	public void setHuman(Human wifeHuman) {
		System.out.println(">> PigAnimal: inside setHuman");
		this.human = wifeHuman;
	}
	
	/**
	 * @author cole
	 * @Autowired will find an object to assign to feederHuman parameters with the same component name
	 */
	@Autowired
	public void doSomething(Human feederHuman) {
		System.out.println(">> PigAnimal: inside doSomething");
		this.human = feederHuman;
	}
	
	/**
	 * @author cole
	 * @Autowired will find an object to assign to this parameters with the same component names
	 */
	@Autowired
	public void doSomething2Paramaters(Human wifeHuman, Human feederHuman) {
		System.out.println(">> PigAnimal: inside doSomething2Paramaters");
		this.human = wifeHuman;
	}
	
	
	
	
	@Override
	public String getName() {
		human.work();
		return "Ut Ut pig, no trainer, need food only";
	}

}





