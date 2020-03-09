package com.colenhut.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.colenhut.aopdemo.dao.AccountDAO;

public class MainApplication {

	public static void main(String[] args) {
		
		//read soring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO accountDAO = context.getBean("account", AccountDAO.class);
		accountDAO.getText();
		
		System.out.println("\n");
		
		accountDAO.setText("text from Cole with love");
		
		
		//close context
		context.close();

	}

}
