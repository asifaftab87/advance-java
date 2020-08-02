package org.loop;

public class ExitLoop {

	public static void main(String[] args) {
		
		int i = 1;
		
		do {
			System.out.println("will execut at least once");
			i++;
		}
		while(i<4);
		
		char n = 'a';
		while(n<='z'){
			System.out.print(n+" ");
			n++;
		}
	}
}
