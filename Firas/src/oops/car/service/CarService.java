package oops.car.service;

import java.util.List;

import oops.car.model.Car;
import oops.car.repository.CarRepository;

public class CarService {
	
	public CarService() {
		CarRepository.createCarList();
	}
	
	public static List<Car> findAll(){
		return CarRepository.findAll();
	}
	
	public static void addCar(Car car) {
		CarRepository.addCar(car);
	}
	
	public static void deleteCar(int index) {
		CarRepository.deleteCar(index);
	}
	
	public static Car findByPrice(int price) {
		return CarRepository.findByPrice(price);
	}
}
