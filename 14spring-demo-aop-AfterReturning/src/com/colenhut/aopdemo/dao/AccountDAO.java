package com.colenhut.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.colenhut.aopdemo.Account;

@Component
public class AccountDAO {
	
	
	public List<Account> findAccounts(){
		
		System.out.println("Inside " + getClass() + " findAccounts()");
		
		List<Account> list = new ArrayList<Account>();
		
		Account acc1 = new Account("Cole", "Silver");
		Account acc2 = new Account("Andy", "Platinum");
		Account acc3 = new Account("Nhut", "Gold");
		
		
		list.add(acc1);
		list.add(acc2);
		list.add(acc3);
		
		
		return list;
	}
	
	
}
