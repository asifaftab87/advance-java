package loop;

public class Practice16To20 {

	public static void main(String[] args) {
//		16.	Wap to enter a number and print its reverse.
		
			int orgnal = 1234, reversed = 0;
			for(;orgnal > 0; orgnal /= 10) {
				
				int rr = orgnal % 10;
				reversed = reversed * 10 + rr;
			}
			System.out.println("number in reverse: " + reversed);
			
			
//		17.	Wap to check whether a number is palindrome or not.

			int pal = 494, reverse = 0, rPal;
			
			int tem = pal;
			System.out.println("");

			for(; pal > 0;) {
				
				rPal = pal % 10;
				pal /= 10;
				reverse = reverse * 10 + rPal;
			}
			if(reverse == tem) 
			System.out.println("number is palindrome");
			else
				System.out.println("number is not palindrome");
			
			
//		18.	Wap to print all ASCII character with their values.

			System.out.println("");
			System.out.println("all ascii characters: ");
			for(char firstChar = '0'; firstChar < 255; firstChar++) {
				System.out.println(firstChar);
			}
			
			
//		19.	Wap to find power of a number using for loop.

			System.out.println("");
			int x = 5, power = 1, exponent = 1;
			for(;power <= 4; power++) {
				
				exponent = x * exponent ;
			}
			System.out.println(x + "^4 = " + exponent);
					
			
//		20.	Wap to calculate factorial of a number.

			System.out.println("");
			System.out.println("factorial of 4: ");
			
			int fNum = 4, fact = 1;
			
			for(;fNum > 0; fNum--) {
				
				fact = fact * fNum;
				System.out.println(fact);
			}
	}
}
