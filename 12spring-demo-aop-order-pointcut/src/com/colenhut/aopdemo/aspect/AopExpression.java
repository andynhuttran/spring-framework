package com.colenhut.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpression {
	
	@Pointcut("execution(* com.colenhut.aopdemo.dao.*.get*(..))")
	public void forGetter() {
		
	}
	
	
	@Pointcut("execution(* com.colenhut.aopdemo.dao.*.set*(..))")
	public void forSetter() {
		
	}
	
	@Pointcut("forGetter() || forSetter()")
	public void forGetterAndSetter() {
		
	}
	
}
