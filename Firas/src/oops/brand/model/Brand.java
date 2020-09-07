package oops.brand.model;

import java.io.Serializable;

public class Brand implements Serializable{

	private static final long serialVersionUID = -4594405842413090268L;
	
	private String name;
	private String type;
	private double rating;
	private String origin;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String toString() {
		return "name: " +name+ "	type: " +type+ "	rating: "+rating+"	origin: "+origin;	
	}
	
}
