package com.colenhut.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectDemo {
	
	//this is where we add all of our related advices for logging
	
	
	//let 's start with an @Before advice
	@Before("execution(public void com.colenhut.aopdemo.dao.AccountDAO.addAccount())")
	public void beforeAddAccountAdvice() {		
		System.out.println("==> @Before advice runs before a function");
	}
	
	 
	@After("execution(public * com.colenhut.aopdemo.dao.MembershipDAO.addAccount())")
	public void afterAddAccountAdvice() {		
		System.out.println("==> @@After advice runs after a function");
	}
	
	
	
	
	
	@Pointcut("execution(* com.colenhut.aopdemo.dao.*.get*(..))")
	public void forGetter() {
		
	}
	
	
	@Pointcut("execution(* com.colenhut.aopdemo.dao.*.set*(..))")
	public void forSetter() {
		
	}
	
	@Pointcut("forGetter() || forSetter()")
	public void forGetterAndSetter() {
		
	}
	
	
	@Before("forGetterAndSetter()")
	public void beforGetterAndSetter() {
		System.out.println("==> APO: beforGetterAndSetter()");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
