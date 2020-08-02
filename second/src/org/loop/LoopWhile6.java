package org.loop;

public class LoopWhile6 {

	public static void main(String[] args) {
		
		int n = 5912, s=0;
		
		while(n>0) {
			int r = n % 10;
			s = s + r;
			n = n / 10;
		}
		System.out.println("s: "+s);
	}
}
