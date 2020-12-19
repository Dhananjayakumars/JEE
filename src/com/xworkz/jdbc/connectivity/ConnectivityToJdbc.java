package com.xworkz.jdbc.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectivityToJdbc {
	public static void main(String[] args) {

		String sqlquery = "select * from kannada_movies";
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/films", "root", "7090");
				Statement stmt = conn.createStatement(); // Environment u can execute ur SQL queries)
				ResultSet result = stmt.executeQuery(sqlquery);) {
			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				int year = result.getInt(3);
				double rating = result.getDouble(4);
				String hero = result.getString(5);
				String heroine = result.getString("heroine");

				System.out.print("id " + id);
				System.out.print(" name " + name);
				System.out.print(" year " + year);
				System.out.print(" rating " + rating);
				System.out.print(" hero " + hero);
				System.out.println(" heroine " + heroine);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
