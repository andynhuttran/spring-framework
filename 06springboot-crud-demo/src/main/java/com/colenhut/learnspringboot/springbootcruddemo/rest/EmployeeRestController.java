package com.colenhut.learnspringboot.springbootcruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colenhut.learnspringboot.springbootcruddemo.entity.Employee;
import com.colenhut.learnspringboot.springbootcruddemo.service.EmployeeService;

@RestController
@RequestMapping("/my-api")
public class EmployeeRestController {
	
	
	private EmployeeService employeeService;
	
	
	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	@GetMapping("/list-employees")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	
	@GetMapping("/employee/{id}")
	public Employee getById(@PathVariable int id){
		Employee e = employeeService.getById(id);		
		if (e == null) {
			throw new RuntimeException("There is no employee with Id: " + id);			
		}		
		return e;
	}
	
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);		
		return employee;
	}
	
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {		
		employeeService.deleteById(id);
		return "Deleted employee with id: " + id;
	}
	
	
	
	
}




















