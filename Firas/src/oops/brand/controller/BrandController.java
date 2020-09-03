package oops.brand.controller;

import java.util.ArrayList;
import java.util.List;

import oops.brand.model.Brand;
import oops.brand.service.BrandService;

public class BrandController {

	public static void main(String[] args) {

		BrandService brandService = new BrandService();								//object
		
		System.out.println("fetching all brands");
		List<Brand> listBrand = BrandService.findAll();
		for(Brand brand : listBrand) {
			System.out.println(brand);
		}
		
		System.out.println("\nadding a new brand");
		
		List<Brand> listBrand2 = BrandService.findAll();
		for(Brand brand : listBrand2) {
			System.out.println(brand);
		}
		Brand brand = new Brand();
		
		brand.setName("grab");
		brand.setType("e-hailing");
		brand.setRating(5);
		brand.setOrigin("asia");
		
		System.out.println(brand);
		BrandService.addBrand(brand);
		
		System.out.println("\n-------------new brand added--------------\n");
		
		System.out.println("\ndeleting a brand");
		BrandService.deleteBrand(4);
			for(Brand brand1 : listBrand2) {
				System.out.println(brand1);
			}
		System.out.println("\n---------new brand deleted--------------\n");
		
		System.out.println("\nbrands by rating");
		
		brandService.findByRating(8.1);
			for(Brand b : listBrand2) {
				if(8.1 <= b.getRating()) {
					System.out.println(b);				}
			}
		}
}
