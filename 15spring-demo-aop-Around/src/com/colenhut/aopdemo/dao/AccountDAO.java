package com.colenhut.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.colenhut.aopdemo.Account;

@Component
public class AccountDAO {
	
	
	public List<Account> findAccounts(boolean input) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
