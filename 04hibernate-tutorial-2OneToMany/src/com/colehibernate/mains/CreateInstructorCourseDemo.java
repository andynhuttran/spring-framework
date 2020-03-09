package com.colehibernate.mains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.colehibernate.entities.Course;
import com.colehibernate.entities.Instructor;
import com.colehibernate.entities.InstructorDetail;

public class CreateInstructorCourseDemo {

	public static void main(String[] args) {
		
		try (
			SessionFactory factory = new Configuration()
										.configure()
										.addAnnotatedClass(Course.class)
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.buildSessionFactory();
										
			Session session = factory.getCurrentSession()
		){
			
			
				
				session.beginTransaction();
				
				/***************Important Part******************/
				System.out.println("Creating instructor....");
				Instructor instructor = new Instructor("Garial", "Teo", "teo@gmail.com");				
				
				System.out.println("Creating courses....");
				Course course1 = new Course("Java Master Class");
				Course course2 = new Course("Machine Learning Class");
				Course course3 = new Course("Deep Learning Class");
								
				System.out.println("Linking instructor and courses....");
				instructor.addCourse(course1);
				instructor.addCourse(course2);
				instructor.addCourse(course3);
				
				
				/*
				 * depend on Cascade value, this will save them all or one only.
				 * if they are cascade.all or cascade.remove, all associated objects will be saved together when parent object is saved.  
				 * if they are NOT cascade.all and cascade.remove, we have to save one by one all object to store them to database
				 */
				
				System.out.println("Saving them all..");
				session.save(instructor);
				session.save(course1);
				session.save(course2);
				session.save(course3);
				
				
				/*************End Important Part********************/
				
				session.getTransaction().commit();
				
				System.out.println("Done");
			
			
		}
		catch (Exception exp) {
			exp.printStackTrace();
		}
		

	}

}
