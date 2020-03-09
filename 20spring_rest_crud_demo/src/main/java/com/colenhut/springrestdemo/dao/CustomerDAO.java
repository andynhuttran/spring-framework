package com.colenhut.springrestdemo.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.colenhut.springrestdemo.data.DataSource;
import com.colenhut.springrestdemo.entity.Customer;

@Repository
public class CustomerDAO {
	
	private List<Customer> customers;
	
	@PostConstruct
	public void initData() {
		customers = DataSource.buildCustomerData(); 
	}
	
	public List<Customer> getAll(){
		return customers;
	}
	
	public Customer getById(int id){
		for (int i = 0; i < customers.size(); ++i) {
			if (customers.get(i).getId() == id) {
				return customers.get(i);
			}
			
		}
		return null;
	}
	
	public Customer addNewOrupdate(Customer customer){
		
		if (customer.getId() <= 0) {
			customers.add(customer);	
			customer.setId(customers.size());
		}
		
		for (int i = 0; i < customers.size(); ++i) {
			if ( customers.get(i).getId() == customer.getId() ) {
				customers.set(i, customer);
				break;
			}
		}
		
		return customer;
	}
	
	public boolean delete(int id) {
		int idx = -1;
		for (int i = 0; i < customers.size(); ++i) {
			if (customers.get(i).getId() == id) {
				idx = i;
			}
		}
		
		if (idx >= 0) {
			customers.remove(idx);
			return true;
		}
		
		return false;
	}
	
	
	
}

