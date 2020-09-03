package oops.country.repository;

import java.util.ArrayList;
import java.util.List;

import oops.country.model.Country;

public class CountryRepository {

	private static List<Country> countryList = new ArrayList<>();
	
	public static void createCountryList() {
	
		Country malaysia = new Country();
	
		malaysia.setPopulation(31.53);
		malaysia.setArea(329847);
		malaysia.setContinent("Asia");
		malaysia.setLanguage("malay");
		
		Country turkey = new Country();
		
		turkey.setPopulation(82);
		turkey.setArea(783562);
		turkey.setContinent("europe");
		turkey.setLanguage("turkish");
		
		Country sudan = new Country();
		
		sudan.setPopulation(41.8);
		sudan.setArea(2);
		sudan.setContinent("africa");
		sudan.setLanguage("arabic");
		
		countryList.add(malaysia);
		countryList.add(turkey);
		countryList.add(sudan);
	}
	
	public static List<Country> findAll(){
		return countryList;
		
	}
	public static void addCountry(Country country) {
		System.out.println("\nadding countries\n");
		countryList.add(country);
	}
	
	public static void deleteCountry(int index) {
		System.out.println("\ndeleting country\n");
		countryList.remove(index);
	}
	
	public static Country findByPopulation(int population) {
		for(Country land : countryList) {
			if(population <= land.getPopulation()) {
				return land;
			}
		}
		return null;
	}
}