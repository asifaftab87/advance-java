package oops.brand.repository;

import java.util.ArrayList;
import java.util.List;

import oops.brand.model.Brand;

public class BrandRepository {
	
	private static List<Brand> brandList = new ArrayList<>();
			
		public static void createBrandList() {
			
			Brand brand = new Brand();
			
			brand.setName("tesla");
			brand.setType("automotive");
			brand.setRating(10);
			brand.setOrigin("terrorism land");
			
			Brand brand2 = new Brand();
			
			brand2.setName("spacex");
			brand2.setType("rocket");
			brand2.setRating(9.5);
			brand2.setOrigin("oil-sucker land");
			
			Brand brand3 = new Brand();
			
			brand3.setName("nokia");
			brand3.setType("mobiles");
			brand3.setRating(7);
			brand3.setOrigin("finland");
			
			Brand brand4 = new Brand();
			
			brand4.setName("petronas");
			brand4.setType("oil");
			brand4.setRating(8.1);
			brand4.setOrigin("malaysia");
			
			brandList.add(brand);
			brandList.add(brand2);
			brandList.add(brand3);
			brandList.add(brand4);
	}
		
		public static List<Brand> findAll(){
			return brandList;
		}
		
		
		public static void addBrand(Brand brand) {
			brandList.add(brand);
		}
		
		public static void deleteBrand(int index) {
			brandList.remove(index);
		}
		
		public static Brand findByRating (double rating) {
			for(Brand b : brandList) {
				if(rating >= b.getRating()) {
					return b;
				}
			}
			return null;
		}
		
		

}
