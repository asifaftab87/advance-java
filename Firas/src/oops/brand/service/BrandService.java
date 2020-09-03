package oops.brand.service;


import java.util.List;

import oops.brand.model.Brand;
import oops.brand.repository.BrandRepository;

public class BrandService {
	
	public BrandService() {
		BrandRepository.createBrandList();
	}
	
	public static List<Brand> findAll(){
		return BrandRepository.findAll();
	}
	
	public static void addBrand(Brand brand) {
		BrandRepository.addBrand(brand);
	}
	
	public static void deleteBrand(int index) {
		BrandRepository.deleteBrand(index);
	}
	
	public Brand findByRating(double rating) {
		return BrandRepository.findByRating(rating);
	}
}

