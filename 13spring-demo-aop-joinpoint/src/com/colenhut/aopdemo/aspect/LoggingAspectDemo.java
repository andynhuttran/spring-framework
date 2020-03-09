package com.colenhut.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspectDemo {

	
	@Before("com.colenhut.aopdemo.aspect.AopExpression.forGetterAndSetter()")
	public void MyLoggingAspectDemo(JoinPoint joinPoint) {
		System.out.println("==> APO: beforGetterAndSetter() - LoggingAspectDemo");
		
		//display the method signature
		MethodSignature methodSig = (MethodSignature)joinPoint.getSignature();		
		System.out.println("**Method: " + methodSig);
		
		Object[] args = joinPoint.getArgs();
		
		for (Object arg : args) {
			System.out.println("**arg: " + arg);
		}
		
		//display method arguments
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
