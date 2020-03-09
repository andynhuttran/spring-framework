package com.colenhut.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspectDemo {

	
	@Before("com.colenhut.aopdemo.aspect.AopExpression.forGetterAndSetter()")
	public void MyLoggingAspectDemo() {
		System.out.println("==> APO: beforGetterAndSetter() - LoggingAspectDemo");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
