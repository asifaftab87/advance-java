package org.coll;

import java.util.ArrayList;
import java.util.List;

public class BoyList {

	public static void main(String[] args) {
		
		Boy b1 = new Boy("asif");
		Boy b2 = new Boy("irshad");
		Boy b3 = new Boy("dilshad");
		
		List<Boy> boyList = new ArrayList<>();
		boyList.add(b1);
		boyList.add(b2);
		boyList.add(b3);
		
		for(int i=0 ; i<boyList.size() ; i++) {
			Boy boy = boyList.get(i);
			String name = boy.getName();
			System.out.println("name: "+name);
		}
		
	}
}
