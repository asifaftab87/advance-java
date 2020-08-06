package loop;

public class Practice01To05 {

	public static void main(String[] args) {
//		1.	Wap to print all natural numbers from 1 to n.
			int a = 1;
			
			System.out.println("natural numbers: ");
			for(;a <= 20; a++) {
				System.out.print(a + " ");
			}

			
//		2.	Wap to print all natural numbers in reverse (from n to 1).
			
			int b = 20;
			
			System.out.println("\n");
			System.out.println("natural numbers in reverse: ");
			for(;b > 0; b--) {
				System.out.print(b + " ");
			}
			
//		3.	Wap to print all alphabets from a to z.
			
			
			System.out.println("\n");
			System.out.println("alphabets: ");
			for(char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter + " ");
			}
			
//		4.	Wap to print all even numbers between 1 to 100.
			
			System.out.println("\n");
			System.out.println("even numbers: ");
			for(int even = 2; even <=100; even+=2) {
				System.out.print(even + " ");
			}
			
//		5.	Wap to print all odd number between 1 to 100.
			
			// let's do this one in another way
			
			System.out.println("\n");
			System.out.println("odd numbers: ");
			for(int odd = 1; odd <= 100; odd++) {
				
			// here's the new way
				if(odd % 2 != 0)
				System.out.print(odd + " ");
			}

			

	}
}
