package oops.car.repository;

import java.util.ArrayList;
import java.util.List;

import oops.car.model.Car;

public class CarRepository {

	private static List<Car> carList = new ArrayList<>();

	public static void createCarList() {							// constructor
		
		Car car = new Car();							// object
		car.setModel("Tesla");
		car.setPrice(50000);
		car.setYear(2014);
		car.setColor("blue\n");
		
		Car car2 = new Car();
		car2.setModel("Toyota");
		car2.setPrice(51000);
		car2.setYear(2012);
		car2.setColor("yellow\n");
		
		Car car3 = new Car();
		car3.setModel("BMW");
		car3.setPrice(49000);
		car3.setYear(2018);
		car3.setColor("green\n");
		
		carList.add(car);								
		carList.add(car2);
		carList.add(car3);
	}

	// finding all cars
		public static List<Car> findAll(){
			return carList;
		}
		
	// adding car
	public static void addCar(Car car) {
		carList.add(car);
	}
	
	//deleting an item
	public static void deleteCar(int index) {
		System.out.println("\ndeleting\n");
		carList.remove(0);
	}
	
	public static Car findByPrice(int price) {
		for(Car vehicle : carList) {
			if(price <= vehicle.getPrice()) {
				return vehicle;
			}
		}
		return null;
	}
	
	
	
	
	
	

}
