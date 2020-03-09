package com.colenhut.learnspringboot.springbootcruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.colenhut.learnspringboot.springbootcruddemo.entity.Employee;


//define entity type and primary key

@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {	
	
	
}
