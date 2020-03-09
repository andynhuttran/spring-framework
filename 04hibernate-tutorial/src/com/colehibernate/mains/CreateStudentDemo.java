package com.colehibernate.mains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.colehibernate.entities.StudentEntity;


public class CreateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = null;
		
		try {

			
			//create session factory
			System.out.println("creating session factory...");
			factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(StudentEntity.class)
					.buildSessionFactory();

			//create session
			System.out.println("creating session...");
			try (Session session = factory.getCurrentSession()){
			
				//create student object
				System.out.println("create 3 student objects");
				StudentEntity student1 = new StudentEntity("S1", "Heo 1", "pig1@gmail.com");
				StudentEntity student2 = new StudentEntity("S2", "Heo 2", "pig2@gmail.com");
				StudentEntity student3 = new StudentEntity("S3", "Heo 3", "pig3@gmail.com");
				
				//start transaction
				session.beginTransaction();
				
				//save the student object
				System.out.println("saving the student objects...");
				session.save(student1);
				session.save(student2);
				session.save(student3);
							
				//commit transaction
				session.getTransaction().commit();
				
				System.out.println("Done !!!");
			}
		}
		catch (Exception exp) {
			exp.printStackTrace();
		}
		finally {
			
			if (factory != null) factory.close();
		}

	}

}
