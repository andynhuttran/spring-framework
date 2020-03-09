package com.colehibernate.mains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.colehibernate.entities.StudentEntity;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(StudentEntity.class)
				.buildSessionFactory()){
			
			Session session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			deleteStudentById(session, 1);
			
			deleteStudentByIdUsingQuery(session, 2);
			
			session.getTransaction().commit();
		}

	}
	
	
	private static void deleteStudentById(Session session, int id) {		
		StudentEntity std = session.get(StudentEntity.class, id);
		session.delete(std);		
	}
	
	
	private static void deleteStudentByIdUsingQuery(Session session, int id) {		
		session.createQuery("delete StudentEntity where id=" + id).executeUpdate();
	}
	

}












