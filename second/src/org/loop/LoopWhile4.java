package org.loop;

public class LoopWhile4 {

	public static void main(String[] args) {
		
		int n = 1, i=1, s=0;
		
		while(i<=n) {
			s = s + i;
			i++;
		}
		System.out.println("sum: "+s);
	}
}
