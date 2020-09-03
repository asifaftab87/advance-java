package oops.car.model;

public class Car {
	
	private String model;
	private int price;
	private int year;
	private String color;
	
	
	public Car() {}														// constructor
	
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "model: " + model+ "\n" + " price: " +price+ "\n" + " year: " +year+ "\n" + " color: " +color;
	}

}
