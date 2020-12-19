package com.xworkz.jdbc.preferedstatement.insert;

public class Films {
	 private int id;
	 private String name;
     private int release_year;
	 private double IDBI_rating;
	 private String hero;
     private String heroine;
     
     
	public Films(int id, String name, int release_year, double iDBI_rating, String hero, String heroine) {
		super();
		this.id = id;
		this.name = name;
		this.release_year = release_year;
		IDBI_rating = iDBI_rating;
		this.hero = hero;
		this.heroine = heroine;
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRelease_year() {
		return release_year;
	}


	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}


	public double getIDBI_rating() {
		return IDBI_rating;
	}


	public void setIDBI_rating(double iDBI_rating) {
		IDBI_rating = iDBI_rating;
	}


	public String getHero() {
		return hero;
	}


	public void setHero(String hero) {
		this.hero = hero;
	}


	public String getHeroine() {
		return heroine;
	}


	public void setHeroine(String heroine) {
		this.heroine = heroine;
		
	}


	@Override
	public String toString() {
		return "JdbcInsertFilms [id=" + id + ", name=" + name + ", release_year=" + release_year + ", IDBI_rating="
				+ IDBI_rating + ", hero=" + hero + ", heroine=" + heroine + "]";
	}
     
     
     
     
     
}
