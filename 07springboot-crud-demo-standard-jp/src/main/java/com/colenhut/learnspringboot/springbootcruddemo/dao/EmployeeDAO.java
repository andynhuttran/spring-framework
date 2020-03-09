package com.colenhut.learnspringboot.springbootcruddemo.dao;

import java.util.List;

import com.colenhut.learnspringboot.springbootcruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee getById(int id);
	
	public void save(Employee emp);
	
	public void deleteById(int id);
	
}
