package com.colenhut.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspectDemo {

	
	@Around("com.colenhut.aopdemo.aspect.AopExpression.forAnyMethod()")
	public Object aroundFindAccounts(ProceedingJoinPoint joinPoint) throws Throwable {
		
		long begin = System.currentTimeMillis();
		
		Object result = null;
		
		try {		
			result = joinPoint.proceed(); //call the main method
		}
		catch (Exception exc) {
			throw exc;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("**Time to execute is: " + (end-begin));
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	
}
