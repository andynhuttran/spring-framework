package com.colehibernate.mains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.colehibernate.entities.Instructor;
import com.colehibernate.entities.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		
		try (
			SessionFactory factory = new Configuration()
										.configure()
										.addAnnotatedClass(InstructorDetail.class)
										.addAnnotatedClass(Instructor.class)
										.buildSessionFactory();
										
			Session session = factory.getCurrentSession()
		){
			
			
				
				session.beginTransaction();
				
				/***************Important Part******************/
				InstructorDetail instructorDetail = new 
						InstructorDetail("wwww.youtube.com/colenhut", "love 2 code Java"); 
				
				Instructor instructor = new Instructor("Garial", "Teo", "teo@gmail.com");
				
				 
				instructor.setInstructorDetail(instructorDetail); //hook them up
				
				//this code also save instructorDetail to table instructor_detail
				//because of CascadeType.ALL
				session.save(instructor);			
				/*************End Important Part********************/
				
				session.getTransaction().commit();
			
			
		}
		catch (Exception exp) {
			exp.printStackTrace();
		}
		

	}

}
