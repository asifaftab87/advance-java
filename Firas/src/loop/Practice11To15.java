package loop;

public class Practice11To15 {

	public static void main(String[] args) {
//		11.	Wap to find first and last digit of a number.
		
				int firstLast = 34565367, first = firstLast, last = firstLast;
				
				for(; first > 10 || last > 10;) {
					
					first = first/10;
					last = last%10;
					
					
				}
				System.out.println("first number is " + first);
				System.out.println("last number is " + last);
					
			
//		12.	Wap to find sum of first and last digit of a number.
				
				int sumNum = 435267, firstNum = sumNum, lastNum = sumNum, numSum = 1;
			
				System.out.println("\n");
				for(; firstNum > 10 || lastNum > 10;) {
					
					firstNum /= 10;
					lastNum %= 10;
					numSum = firstNum + lastNum;
					
				}
				System.out.println("first number is " + firstNum);
				System.out.println("last number is " + lastNum);
				System.out.println("sum of first and last digits = " + numSum);
			
			
//		13.	Wap to swap first and last digits of a number.

			int swp = 2345637, temp, firstswp = swp, lastswp = swp;
				
			System.out.println("\n");
			
			for(;firstswp > 10 || lastswp > 10;) {
				
				
				firstswp /= 10;
				lastswp %= 10;
			}	temp = firstswp;

			System.out.println("first number is " + firstswp);
			System.out.println("last number is " + lastswp);
			
			firstswp = lastswp;
			lastswp = temp;
					System.out.println("swapped first number is " + firstswp);
					System.out.println("swapped last number is " + lastswp);
			
					
//		14.	Wap to calculate sum of digits of a number.
				
			System.out.println("");
			int digit = 11, r = 0, sumDigit = 0;
			
			for(;digit > 0;) {
				
				r = digit % 10;		// isolate each digit
				digit /= 10;		// separate the rest from the isolated digit and REPEAT
				sumDigit = sumDigit + r;

			}
			System.out.println("sum of all digits = " + sumDigit);
			

//		15.	Wap to calculate product of digits of a number.
			
			System.out.println("");
			int prDigit = 3624, product = 1, rDigit = 0;
			
			for(;prDigit > 0;) {
				
				rDigit = prDigit % 10;
				prDigit /= 10;
				product = product * rDigit;
			}
			System.out.println("product of digits = " + product);
	}
}
