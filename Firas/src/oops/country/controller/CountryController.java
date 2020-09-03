package oops.country.controller;

import java.util.List;

import oops.country.model.Country;
import oops.country.service.CountryService;

public class CountryController {

	public static void main(String[] args) {
		
		CountryService countryService = new CountryService();
	
		System.out.println("fetching the list:");
		
		List<Country> countList = CountryService.findAll();
		for(Country c : countList) {
			System.out.println(c);
		}
//-------------------------------------------------------------------------------------------		
		System.out.println("\nadd new country to the list:");
		
		List<Country> countList2 = CountryService.findAll();
		
		Country country = new Country();															// adding new
		country.setPopulation(30);
		country.setArea(555);
		country.setContinent("Asia");
		country.setLanguage("Arabic");
		
		System.out.println(country);
		CountryService.addCountry(country);
		for(Country c : countList2) {
			System.out.println(c);
		}
		
//--------------------------------------------------------------------------------------------
		System.out.println("\ndelete a country");
		CountryService.deleteCountry(0);
		for(Country c : countList) {
			System.out.println(c);
		}
		
//---------------------------------------------------------------------------------------------
		System.out.println("\nfind a country by population");
		CountryService.findByPopulation(40);
		for(Country count : countList) {
			if(40 < count.getPopulation()) {
			System.out.println(count);
			}
		}
	}
	
}
