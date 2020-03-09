package com.colenhut.learnspringboot.springbootcruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.colenhut.learnspringboot.springbootcruddemo.entity.Employee;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJPAImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Employee> findAll() {		
		Query query = entityManager.createQuery("from Employee", Employee.class);		
		return query.getResultList();
	}

	@Override
	public Employee getById(int id) {
		return entityManager.find(Employee.class, id);
	}

	@Override
	public void save(Employee emp) {		
		Employee dbEmployee = entityManager.merge(emp);
		emp.setID(dbEmployee.getID());
	}
	
	@Override
	public void deleteById(int id) {		
		Query query = entityManager.createQuery("delete from Employee where ID=:empId");		
		query.setParameter("empId", id);		
		query.executeUpdate();		 
	}
	
	
	
	
}
