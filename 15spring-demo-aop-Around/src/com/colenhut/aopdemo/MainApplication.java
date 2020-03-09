package com.colenhut.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.colenhut.aopdemo.dao.AccountDAO;

public class MainApplication {

	public static void main(String[] args) {
		
		//read soring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> list = accountDAO.findAccounts(true);
		
		System.out.println("\n\n Main program after finding account()");
		System.out.println("------------");
		
		System.out.println(list);
		
		System.out.println("-----------");
		
		
		//close context
		context.close();

	}

}
