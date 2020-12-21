package com.xworkz.jdbc.preparedstatement.batchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
	
	static public Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/films", "root", "7090");
		
		
		
		
	}
	
	

}
