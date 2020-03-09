package com.colenhut.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AnalysisAspectDemo {
	
	
	@Before("com.colenhut.aopdemo.aspect.AopExpression.forAnyMethod()")
	public void MyAnalysisAspectDemo() {
		System.out.println("==> APO: beforGetterAndSetter() - AnalysisAspectDemo");
	}
	
}
