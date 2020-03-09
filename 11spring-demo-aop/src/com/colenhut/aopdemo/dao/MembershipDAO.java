package com.colenhut.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	
	private String text;
	
	public MembershipDAO() {
		text = "Default MembershipDAO";
	}
	
	
	public MembershipDAO(String text) {
		this.text = text;
	}
	
	public void addAccount() {		
		System.out.println(getClass() + ": addAccount() - AOP DEMO: " + this.text);		
	}
	
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}
	
}
