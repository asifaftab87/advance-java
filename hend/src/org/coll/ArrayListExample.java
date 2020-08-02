package org.coll;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("asif");
		list.add("dilshad");
		list.add("atif");
		list.add("alam");
		list.add("naushad");
		
		for(int i=0 ; i<list.size() ; i++) {
			String name = list.get(i);
			System.out.println(name);
		}
	}
}
