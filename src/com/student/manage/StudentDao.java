package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;




public class StudentDao {

	
	public static boolean  InsertStudentDB(Student s) {
		//jdbc code..
		
		boolean  f=false;
		try {
			Connection con=JDBC_Connection.Create_connection();
			String query="insert into student(sname,sphone,scity) values(?,?,?)";
			
			//Prepared Statement 
			
			PreparedStatement pst=con.prepareStatement(query);
			
			// set  the value  of  parameter
			
			pst.setString(1,s.getStudentName());
			pst.setString(2, s.getStudentPhone());
			pst.setString(3, s.getStudentCity());
			
			//execute
			
			pst.executeUpdate();
			
			f=true;
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		
		
		
		boolean  f=false;
		try {
			Connection con=JDBC_Connection.Create_connection();
			String query="delete from student where  sid=?";
			
			//Prepared Statement 
			
			PreparedStatement pst=con.prepareStatement(query);
			
			// set  the value  of  parameter
			
			pst.setInt(1,userId);
			
			//execute
			
			pst.executeUpdate();
			
			f=true;
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return f;
		
		
	}

	public static void showAllStudent() {
		// TODO Auto-generated method stub
		
		
		boolean  f=false;
		try {
			Connection con=JDBC_Connection.Create_connection();
			String q="select * from student";
			
			// Statement 
			Statement st=con.createStatement();
			ResultSet res= st.executeQuery(q);
		 
			while(res.next()) {
		        	   
		        	 int id =res.getInt(1);
		        	 String name=res.getString(2);
		        	 String phone=res.getString(3);
		        	 String city=res.getString(4);
		        	 
		        	 System.out.println("ID : "+id);
		        	 
		        	 System.out.println("Name : "+name);
		        	 
		        	 System.out.println("Phone : "+phone);
		        	 
		        	 System.out.println("City : "+city);
		        	 
		        	 System.out.println("++++++++++++++++++++++");
		          }
       			
		
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		
	}
	
}
