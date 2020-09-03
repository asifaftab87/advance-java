package oops.country.model;

import java.io.Serializable;

public class Country implements Serializable{

	private static final long serialVersionUID = 126579855550032177L;
	
	private double population;
	private String continent;
	private int area;
	private String language;
	
	
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String toString() {
		return "population:	"+population+ ",	continent:	" +continent+ ",	area:	"+area+",	language,	"+language;
	}
	
}
