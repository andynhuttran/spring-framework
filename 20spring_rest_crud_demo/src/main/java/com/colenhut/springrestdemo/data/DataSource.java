package com.colenhut.springrestdemo.data;

import java.util.ArrayList;
import java.util.List;

import com.colenhut.springrestdemo.entity.Customer;

public class DataSource {
	
	private static List<Customer> customers = null;
	
	
	public static List<Customer> buildCustomerData() {
	
		if (customers == null) {
			initData();
		}
		
		return customers;
	}
	
	private static void initData() {
		customers = new ArrayList<Customer>();
		
		customers.add(new Customer(1, "Cole", 32, true));
		customers.add(new Customer(2, "Bella", 31, false));
		customers.add(new Customer(3, "Andy", 18, true));
		customers.add(new Customer(4, "Dav", 18, true));
		customers.add(new Customer(5, "Peter", 18, true));
		customers.add(new Customer(6, "Travis", 18, true));
		customers.add(new Customer(7, "Lily", 18, false));
		
	}
	
	
}
