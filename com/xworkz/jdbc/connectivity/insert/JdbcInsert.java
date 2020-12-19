package com.xworkz.jdbc.connectivity.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcInsert {

	public static void main(String[] args) {

		ArrayList<Films> films = new ArrayList<Films>();
		films.add(new Films(6, "yajamana", 2019, 6.8, "darshan", "rashmika"));
		films.add(new Films(7, "ramachari", 2017, 8.6, "yash", "radhika"));
		films.add(new Films(8, "rajakumara", 2017, 6.8, "puneeth", "priya"));

		for (Films fil : films) {
			insertrow(fil);
		}

	}

	private static void insertrow(Films fil) {

		int id = fil.getId();
		String name = fil.getName();
		int year = fil.getRelease_year();
		double rating = fil.getIDBI_rating();
		String hero = fil.getHero();
		String heroine = fil.getHeroine();

		String sqlquery = "insert into kannada_movies values(" + id + ",'" + name + "'," + year + ",+" + rating + ",'"
				+ hero + "','" + heroine + "')";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/films", "root", "7090");

				Statement stmt = conn.createStatement();) {
			int results = stmt.executeUpdate(sqlquery);
			System.out.println("The no of rows insert is : " + results);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
