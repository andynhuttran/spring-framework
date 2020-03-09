package com.colehibernate.mains;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.colehibernate.entities.StudentEntity;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		try (SessionFactory factory = new Configuration()
									.configure()
									.addAnnotatedClass(StudentEntity.class)
									.buildSessionFactory()){			
			Session session = factory.getCurrentSession();
			
			
			session.beginTransaction();
			
			System.out.println("\n******************Getting student by id*********************");
			int id = 1;
			StudentEntity std1 = getStudentById(session, id);			
			System.out.println("Student with id: " + id + " is: " + std1);
			
			
			System.out.println("\n******************Getting all students*********************");				
			printStudents(getAllStudent(session));
			
			
			System.out.println("\n******************Getting students who have name Cole*********************");
			printStudents(getAllByFirstName(session, "Cole"));			
			
			
			
			session.getTransaction().commit();				
			System.out.println("Done");
			
		}
	}
	
	
	
	private static void printStudents(List<StudentEntity> list) {
		for (StudentEntity s : list) {
			System.out.println(s);
		}
	}
	
	private static StudentEntity getStudentById(Session session, int id) {		
		return session.get(StudentEntity.class, id);		
	}
	
	
	//from table_name
	//table_name is the class name which map to database
	//don't use name of table in database
	private static List<StudentEntity> getAllStudent(Session session) {		
		List<StudentEntity> list = session.createQuery("from StudentEntity").getResultList();
		return list;
	}
	
	
	//firstName is properties in mapping class, but a column name in database
	//because when work with mapping class only
	private static List<StudentEntity> getAllByFirstName(Session session, String firstName) {				
		List<StudentEntity> list = session.createQuery("from StudentEntity where firstName like '%" + firstName + "%'").getResultList();
		return list;
	}
	

}
