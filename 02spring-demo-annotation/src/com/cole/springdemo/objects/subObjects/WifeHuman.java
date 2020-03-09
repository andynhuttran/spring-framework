package com.cole.springdemo.objects.subObjects;

import org.springframework.stereotype.Component;

@Component
public class WifeHuman implements Human {

	@Override
	public void work() {
		System.out.println("Wife does cooking");
	}

}
