package com.cole.springdemo.objects;

import com.cole.springdemo.objects.subObjects.Trainer;

public class LionAnimal implements Animal {

	private Trainer trainer;
	
	public LionAnimal(Trainer trainer) {
		this.trainer = trainer;
	}
	
	@Override
	public String getName() {
		return "Ghu Ghu Lion, with trainer " + trainer.getName() + " age: " + trainer.getAge() + " salary is " + trainer.getSalary();
	}

}
