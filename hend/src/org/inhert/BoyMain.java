package org.inhert;

import java.util.ArrayList;
import java.util.List;

public class BoyMain {

	public static void main(String[] args) {
		
		Boy b1 = new Boy();
		Boy b2 = new Boy();
		Boy b3 = new Boy();
		
		b1.setId(1);
		b2.setId(2);
		b3.setId(3);
		
		List<Boy> list = new ArrayList<>();
		
		list.add(b1);
		list.add(b3);
		list.add(b2);
		
		for(int i=0 ; i<list.size() ; i++) {
			Boy boy = list.get(i);
			System.out.println(boy.getId());
		}
	}
}
