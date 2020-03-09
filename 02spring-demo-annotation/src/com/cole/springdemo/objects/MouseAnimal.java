package com.cole.springdemo.objects;

import org.springframework.stereotype.Component;

@Component
public class MouseAnimal implements Animal {

	@Override
	public String getName() {
		return "Uc Uc another pigX, need a lot of food";
	}

}
