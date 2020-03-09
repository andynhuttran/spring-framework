package com.colehibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBCConnection {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/cole_student_tracker?useSSL=false";
		String user = "root";
		String pass = "root";
		
		try {
			
			System.out.println("Connect to db: " + jdbcUrl);
			
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful !!! " + conn);
			
			conn.close();
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			//System.out.println(ex.toString());
		}

	}

}
