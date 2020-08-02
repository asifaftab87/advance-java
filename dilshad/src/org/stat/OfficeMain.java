package org.stat;

public class OfficeMain {

	public static void main(String[] args) {
		
		Office office = new Office();
		
		office.setNum(33);
		office.setType("software");
		
		int num = office.getNum();
		String type = office.getType();
		
		System.out.println("num: "+num);
		System.out.println("type: "+type);
		
	}
}
