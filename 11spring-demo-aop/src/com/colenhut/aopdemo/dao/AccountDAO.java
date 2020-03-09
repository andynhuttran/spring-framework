package com.colenhut.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	private String text;
	
	public AccountDAO() {
		text = "Default text";
	}
	
	
	public AccountDAO(String text) {
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
