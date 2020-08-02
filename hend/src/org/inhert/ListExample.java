package org.inhert;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		System.out.println("size: "+list.size());
		
		list.add(4);
		list.add(-1);
		list.add(1);
		list.add(42);
		
		System.out.println("size: "+list.size());
		
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i+ " : "+list.get(i));
		}
	}
}
