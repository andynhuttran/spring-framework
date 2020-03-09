package com.colenhut.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.colenhut.aopdemo.dao.AccountDAO;
import com.colenhut.aopdemo.dao.MembershipDAO;

public class MainApplication {

	public static void main(String[] args) {
		
		//read soring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO accountDAO = context.getBean("account", AccountDAO.class);
		accountDAO.getText();
		
		
		//get the bean from spring container
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		membershipDAO.setText("Hello world");
		
		//call business method
		accountDAO.addAccount();
		
		membershipDAO.addAccount();
		
		
		//close context
		context.close();

	}

}
