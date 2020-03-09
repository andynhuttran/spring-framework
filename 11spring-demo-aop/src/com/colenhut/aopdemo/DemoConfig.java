package com.colenhut.aopdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.colenhut.aopdemo.dao.AccountDAO;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.colenhut.aopdemo")
public class DemoConfig {
	
	
	@Bean(name = "account")
	public AccountDAO getMyAccountDAO() {
		return new AccountDAO("Custom text");
	}
	
}
