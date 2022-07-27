package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Connection {

	
	static	Connection con;
	
	public static Connection Create_connection() {
	
		
		try {
			//load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user="root";
			String password="Rahul@123";
			String url="jdbc:mysql://localhost:3306/student_manage";   
			//Create  the Connection 
			
			 con=DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			System.out.println(e);
			
			e.printStackTrace();
		}
		return con;
	}
	
}
