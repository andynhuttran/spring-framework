package com.colehibernate.mains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.colehibernate.entities.Instructor;
import com.colehibernate.entities.InstructorDetail;


/*
 * this example demo how to delete InstructorDetail, but Instructor  is still kept
 * Keep note that, it have to remove associated objects before deleting, in case Cascade.remove do not use
 * */

public class CascadeInstructorDetailDemo {

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
				int id = 2;
				InstructorDetail instructorDetail = session.get(InstructorDetail.class, id);
				
				
				
				instructorDetail.getInstructor().setInstructorDetail(null);				
				session.delete(instructorDetail);
						
				/*************End Important Part********************/
				
				session.getTransaction().commit();
			
			
		}
		catch (Exception exp) {
			exp.printStackTrace();
		}
		

	}

}
