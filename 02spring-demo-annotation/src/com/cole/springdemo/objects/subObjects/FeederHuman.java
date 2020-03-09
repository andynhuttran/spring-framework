package com.cole.springdemo.objects.subObjects;

import org.springframework.stereotype.Component;

@Component
public class FeederHuman implements Human {

	//@Override
	public void work() {
		System.out.println("Feed food to cute animals");
	}

}
