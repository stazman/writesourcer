package com.writesourcer.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/writesourcer?useSSL=false";
		
		String user = "username";
		
		String pass = "password";
		
	
		
		try {
			
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			
			System.out.println("Connection successful");
			
		} catch (Exception exc) {
			
			exc.printStackTrace();
			
		}
		
	}

}
