package org.loop;

public class LoopWhile5 {

	public static void main(String[] args) {
		
		int n = 5, f=1;
		
		while(n>=1) {
			f = f * n;
			n--;
		}
		System.out.println("factorial: "+f);
	}
}
