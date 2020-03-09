package com.colenhut.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class CloudAspectDemo {
	
	
	@After("com.colenhut.aopdemo.aspect.AopExpression.forAnyMethod()")
	public void MyCloudAspectDemo() {
		System.out.println("==> APO: afterGetterAndSetter() - CloudAspectDemo");
	}
	
}
