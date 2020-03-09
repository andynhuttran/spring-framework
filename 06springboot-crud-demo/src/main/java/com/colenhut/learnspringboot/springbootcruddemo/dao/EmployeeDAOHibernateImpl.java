package com.colenhut.learnspringboot.springbootcruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.colenhut.learnspringboot.springbootcruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		
		//get current session of hibernate
		try (Session session = entityManager.unwrap(Session.class)){
		
			//create query
			Query<Employee> theQuery = session.createQuery("from Employee", Employee.class);
			
			//execute the query and get list
			List<Employee> employees = theQuery.getResultList();
					
			//return the result
			return employees;
		}
	}

	@Override
	public Employee getById(int id) {
		try (Session session = entityManager.unwrap(Session.class)){
			
			Employee e = session.get(Employee.class, id);
			
			return e;
		}
	}

	@Override
	public void save(Employee emp) {
		try (Session session = entityManager.unwrap(Session.class)){
			session.saveOrUpdate(emp);
		}
		
	}
	@Override
	public void deleteById(int id) {
		try (Session session = entityManager.unwrap(Session.class)){
			
			Query query = session.createQuery("delete from Employee where ID=:employeeId");			
			query.setParameter("employeeId", id);
			
			query.executeUpdate();
			
		}
		
	}
	
	
	
	
}
