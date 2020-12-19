package com.xworkz.jdbc.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) {
		
		String sqlQuery = "update kannada_movies set  release_year=2017 where id=4";
		try(Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/films", "root", "7090");
				Statement stmt= conn.createStatement();	
				)
		
		{
			int result=stmt.executeUpdate(sqlQuery);
			System.out.println("The no of rows updated is : "+ result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
