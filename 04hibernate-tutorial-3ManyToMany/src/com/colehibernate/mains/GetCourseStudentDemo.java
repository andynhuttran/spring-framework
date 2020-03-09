package com.colehibernate.mains;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.colehibernate.entities.Course;
import com.colehibernate.entities.Student;

public class GetCourseStudentDemo {

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
				
				
				System.out.println("\nGet a course first, then get associated students");
				//get course with id = 10
				Course myCourse = session.get(Course.class, 10);
				if (myCourse != null) {
					System.out.println("The Course: " + myCourse);
					List<Student> students = myCourse.getStudents();
					for (Student student : students) {
						System.out.println("  -> student: " + student);
					}
				}
				
				
				System.out.println("\nGet a student first, then get associated courses");				
				//get student with id = 2
				Student student = session.get(Student.class, 2);
				if (student != null) {
					System.out.println("The Student: " + student);
					List<Course> courses = student.getCourses();
					for (Course course : courses) {
						System.out.println("  -> course: " + course);
					}
				}
				
				
				/*************End Important Part********************/				
				session.getTransaction().commit();				
				System.out.println("\nDone");
		}
		catch (Exception exp) {
			exp.printStackTrace();
		}
		

	}

}

