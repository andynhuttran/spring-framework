package com.colenhut.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.colenhut.aopdemo.Account;

@Aspect
@Component
@Order(1)
public class LoggingAspectDemo {

	
	@Before("com.colenhut.aopdemo.aspect.AopExpression.forAnyMethod()")
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
	
	@AfterReturning(
		pointcut="execution(* com.colenhut.aopdemo.dao.AccountDAO.findAccounts(..))",
		returning = "accounts"
			)
	public void MyAfterReturning(JoinPoint joinPoint, List<Account> accounts) {
		
		System.out.println("** executing @AfterReturning in " + joinPoint.getSignature().toShortString());
		
		System.out.println("** " + accounts);
		
		
		accounts.add(new Account("Quan", "Gold"));
		
		upperCaseAccounts(accounts);
	}
	
	
	private void upperCaseAccounts(List<Account> accounts) {
		for (Account acc : accounts) {
			acc.setName(acc.getName().toUpperCase());
		}
	}
	
	
	
	
	
	
	
	
	
	
}
