package com.colehibernate.mains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.colehibernate.entities.StudentEntity;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		try (SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(StudentEntity.class)
				.buildSessionFactory()){
			
			
			Session session = factory.getCurrentSession();					
			session.beginTransaction();
			
			UpdateNameById(session, 1, "New name: 1");
			
			UpdateAllStudent(session, "newEmail@gmail.com");
			
			session.getTransaction().commit();
			System.out.println("Done !!!");
			
		}
		catch (Exception exp) {
			exp.printStackTrace();
		}

	}
	
	
	private static void UpdateNameById(Session session, int id, String newFirstName) {		
		StudentEntity std = session.get(StudentEntity.class, id);
		std.setFirstName(newFirstName);
		session.update(std);
	}
	
	private static void UpdateAllStudent(Session session, String email) {				
		session.createQuery("update StudentEntity set email = '" + email + "'").executeUpdate();		
	}
	
	
	

}
