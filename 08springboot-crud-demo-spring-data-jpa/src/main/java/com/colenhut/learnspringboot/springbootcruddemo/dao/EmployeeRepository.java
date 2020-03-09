package com.colenhut.learnspringboot.springbootcruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colenhut.learnspringboot.springbootcruddemo.entity.Employee;


//define entity type and primary key
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	
}
