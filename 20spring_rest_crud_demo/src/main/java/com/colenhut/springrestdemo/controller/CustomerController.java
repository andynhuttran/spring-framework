package com.colenhut.springrestdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colenhut.springrestdemo.dao.CustomerDAO;
import com.colenhut.springrestdemo.entity.Customer;

@RestController
@RequestMapping("api")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return customerDAO.getAll();
	}	
	
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id){
		return customerDAO.getById(id);
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer){
		customer.setId(0);
		return customerDAO.addNewOrupdate(customer);
	}
	
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer){
		return customerDAO.addNewOrupdate(customer);
	}
	
	
	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id){
		if (customerDAO.delete(id) ) {
			return "Id " + id + " is deleted";
		}		
		return "can not found id " + id;
	}
	
	
}
