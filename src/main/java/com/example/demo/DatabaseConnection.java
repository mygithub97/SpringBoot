package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getDBConnection( ) throws Exception
	{
		Connection conn =null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		// database connection string
		// constants
	    conn = DriverManager.getConnection
	    		("jdbc:mysql://localhost:3306/shopping","root","Keywest1$"); 
		  return conn;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
}
