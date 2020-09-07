package oops.car.controller;

import java.util.List;

import oops.car.model.Car;
import oops.car.repository.CarRepository;
import oops.car.service.CarService;

public class MainCar {

	public static void main(String[] args) {
		
		CarService carService = new CarService();
		System.out.println("fetching cars:");
		List<Car> carList = CarService.findAll();									// find all
		for(Car car: carList) {
			print(car);
		}
		
		System.out.println("adding new car");
		
		List<Car> carList2 = CarService.findAll();									// find all
		for(Car car: carList2) {
			print(car);
		}
		
		Car car = new Car();
		car.setModel("audi");
		car.setPrice(60000);
		car.setYear(2011);
		car.setColor("green");
		CarRepository.addCar(car);
		System.out.println(car);
		
		
// deleting
		CarRepository.deleteCar(0);
		carList2 = CarRepository.findAll();
		for(Car car1 : carList2) {
			System.out.println(car1);
		}
		System.out.println("\none item deleted\n");

		CarService.findByPrice(50000);
			for(Car car1 : carList2) {
				if(50000 <= car1.getPrice()) {
					System.out.println(car1);
				}
		}
	}

	private static void print(Car car) {
		System.out.println("model: " + car.getModel());
		System.out.println("price: " + car.getPrice());
		System.out.println("year: " + car.getYear());
		System.out.println("color: " + car.getColor());
		
	}
}
