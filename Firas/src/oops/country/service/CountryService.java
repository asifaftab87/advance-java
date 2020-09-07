package oops.country.service;

import java.util.List;

import oops.country.model.Country;
import oops.country.repository.CountryRepository;

public class CountryService {
	
	//call methods from repository class

	public CountryService() {
		CountryRepository.createCountryList();
	}
	
	public static List<Country> findAll(){
		return CountryRepository.findAll();
	}
	
	public static void addCountry(Country country) {
		CountryRepository.addCountry(country);
	}
	
	public static void deleteCountry(int index) {
		CountryRepository.deleteCountry(index);
	}
	
	public static Country findByPopulation(int population) {
		return CountryRepository.findByPopulation(population);
	}
}
