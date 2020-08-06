package loop;

public class Practice21To25 {

	public static void main(String[] args) {
		
//		21.	Wap to check whether a number is Prime number or not.
		
		int prime = 4, i = 2;
		boolean p = true;
		
			for(; i > 0; i++) {
			}	
				
			if(prime % 2 != 0) {
				System.out.println(p);
			}
			else
				System.out.println(!p);

			
//		22.	Wap to print all Prime numbers between 1 to n.
			
			System.out.println("");
			System.out.println("prime numbers from 1 to 20: ");
			for(int priNum = 0; priNum <= 20; priNum++) {
			
			if(priNum % 2 != 0)
				System.out.print(priNum + " ");
			}
			
			
//		23.	Wap to find sum of all prime numbers between 1 to n.
			
			System.out.println("\n");
			System.out.println("sum of prime numbers between 1 and 20: ");
			int sum = 0;
			for(int prinum = 0; prinum <= 20; prinum++) {
				
				if(prinum % 2 != 0)
				sum += prinum;
			}
			System.out.println(sum);

			
//		24.	Wap to check whether a number is Armstrong number or not.

			
			
			
//		25.	Wap to print all Armstrong numbers between 1 to n.
		
			System.out.println("");		// space
			int arm = 153, r, sep = 0;	// declaration
			
			int temp = arm;		// meaning that temp = 153 which is fixed, while arm value changes.
			
			for(; arm > 0;) {
				
				r = arm % 10;			// to isolate each number, 3 then 5 then 1. use remainder operation
				arm /= 10;				// we separate the remainder value from the rest
				sep += (r * r * r);		// we find the sum of the new remainder value and then REPEAT
			}
			
			if(sep == temp)		// we compare temp with sum bcs the latest value of arm is 0, not 153 anymore
				System.out.println("armstrong number");
			else
				System.out.println("not armstrong number");
	}
}
