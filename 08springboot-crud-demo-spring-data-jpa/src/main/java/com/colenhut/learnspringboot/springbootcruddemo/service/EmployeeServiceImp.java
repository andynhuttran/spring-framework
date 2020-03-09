package com.colenhut.learnspringboot.springbootcruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colenhut.learnspringboot.springbootcruddemo.dao.EmployeeRepository;
import com.colenhut.learnspringboot.springbootcruddemo.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override	
	public Employee getById(int id) {
		Optional<Employee> opt = employeeRepository.findById(id);
		
		if (opt.isPresent()) {
			return opt.get();
		}
		
		return null;
	}

	@Override
	public void save(Employee emp) {
		employeeRepository.save(emp);
	}

	@Override
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
	}

}
