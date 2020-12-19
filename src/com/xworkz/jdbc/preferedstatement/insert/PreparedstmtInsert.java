package com.xworkz.jdbc.preferedstatement.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class PreparedstmtInsert {

	public static void main(String[] args) {
		
		ArrayList<Films>films=new ArrayList<Films>();
		films.add(new Films(9, "tony", 2013, 5.8, "kitty", "aindritha"));
		films.add(new Films(10, "boss", 2010, 6.8, "darshan", "navya"));
		
		String sqlquery="insert into kannada_movies values(?,?,?,?,?,?)";
		try (Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/films", "root", "7090");
				PreparedStatement prst=conn.prepareStatement(sqlquery);){
			
			for (Films fil:films) {
				prst.setInt(1,fil.getId());
				prst.setString(2, fil.getName());
				prst.setInt(3, fil.getRelease_year());
				prst.setDouble(4, fil.getIDBI_rating());
				prst.setString(5, fil.getHero());
				prst.setString(6, fil.getHeroine());
				
				
				boolean result = prst.execute();
				System.out.println("Result: "+result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
