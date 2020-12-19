package com.xworkz.jdbc.preferedstatement.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedstmtExm {

	public static void main(String[] args) {

		String sqlquery = "insert into kannada_movies values(?,?,?,?,?,?)";
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/films", "root", "7090");
				PreparedStatement prst = conn.prepareStatement(sqlquery);) {

			prst.setInt(1, 11);
			prst.setString(2, "rustum");
			prst.setInt(3, 2018);
			prst.setDouble(4, 5.6);
			prst.setString(5, "shivrajkumar");
			prst.setString(6, "shraddha");

			boolean issuccessfull = prst.execute(); // CRUD
			// true - ResultSet
			// false - CUD
			System.out.println("was the query execution sucessfull: " + issuccessfull);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
