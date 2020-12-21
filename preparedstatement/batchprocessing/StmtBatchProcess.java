package com.xworkz.jdbc.preparedstatement.batchprocessing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StmtBatchProcess {
	public static void main(String[] args) {

		ArrayList<Films> film = new ArrayList<Films>();
		film.add(new Films(18, "rathavara", 2015, 6.9, "srimurali", "rachitha ram"));
		film.add(new Films(19, "hebbuli", 2017, 5.9, "sudeep", "amala"));
		film.add(new Films(20, "gentleman", 2020, 7.8, "prajwal", "nishvika"));
		
		for(Films fil:film) {
			insertrow(fil);
		}

	}

	private static void insertrow(Films fil) {
		int id=fil.getId();
		String name = fil.getName();
		int year = fil.getRelease_year();
		double rating = fil.getIDBI_rating();
		String hero = fil.getHero();
		String heroine = fil.getHeroine();
		
		try(Connection conn=Connectivity.getConnection();
				Statement stmt=conn.createStatement();
				
				) {
//			int results=stmt.executeUpdate("insert into kannada_movies values(" + id + ",'" + name + "'," + year + ",+" + rating + ",'"
//					+ hero + "','" + heroine + "'");
			
			stmt.addBatch("insert into kannada_movies values(" + id + ",'" + name + "'," + year + ",+" + rating + ",'"
					+ hero + "','" + heroine + "')");
			stmt.addBatch("update kannada_movies set heroine='priya anand' where id=8");
			
			 stmt.executeBatch();

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
