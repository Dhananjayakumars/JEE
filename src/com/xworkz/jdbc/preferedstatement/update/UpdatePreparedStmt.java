package com.xworkz.jdbc.preferedstatement.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdatePreparedStmt {

	public static void main(String[] args) {
		String sqlquery="update kannada_movies set release_year=? where id=?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/films", "root", "7090");
				PreparedStatement prpt = conn.prepareStatement(sqlquery)) {
			prpt.setInt(1, 2016);
			prpt.setInt(2, 6);
			
			boolean result = prpt.execute();
			System.out.println("Result: "+result);
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
