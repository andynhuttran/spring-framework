package com.colehibernate.mains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.colehibernate.entities.Course;
import com.colehibernate.entities.Student;

public class CreateCourseStudentDemo {

	public static void main(String[] args) {
		
		try (
			SessionFactory factory = new Configuration()
										.configure()
										.addAnnotatedClass(Course.class)
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
										
			Session session = factory.getCurrentSession()
		){
				session.beginTransaction();				
				/***************Important Part******************/
				
				//create and save course
				Course myCourse = new Course("Learning Java Spring framework");
				session.save(myCourse);
				System.out.println("Saved course: " + myCourse);
				
				//create students
				Student student1 = new Student("Cole1", "Nhut", "cole1@gmail.com");
				Student student2 = new Student("Cole2", "Nhut", "cole2@gmail.com");
				Student student3 = new Student("Cole3", "Nhut", "cole3@gmail.com");
				
				//add students to courses
				myCourse.addStudent(student1);
				myCourse.addStudent(student2);
				myCourse.addStudent(student3);				
				
				//save students
				session.save(student1);
				session.save(student2);
				session.save(student3);
				
				//print to log
				System.out.println("Saved students: " + myCourse.getStudents());
				
				
				/*************End Important Part********************/				
				session.getTransaction().commit();				
				System.out.println("Done");
		}
		catch (Exception exp) {
			exp.printStackTrace();
		}
		

	}

}

