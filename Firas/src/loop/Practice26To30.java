package loop;

public class Practice26To30 {

		public static void main(String[] args) {

//			26.	Wap to check whether a number is Perfect number or not.

			int per = 1, sum = 0, number = 3;
			
			for(; per < number; per++) {
				
				if(number % per == 0)
				sum += per;
			}
			if(sum == number)
			System.out.println("perfect number");
			else
				System.out.println("not perfect");
			
			
//			27.	Wap to print all Perfect numbers between 1 to n.
			
			System.out.println("");
			System.out.println("perfect numbers from 1 to 28: ");

			int Num = 28, p = 1;

					for(; p < Num; p++) {
						if(Num % p == 0)
							System.out.print(p + " ");							
					}
					
				
//			28.	Wap to check whether a number is Strong number or not.
					
				
				
//			29.	Wap to print all Strong numbers between 1 to n.

				
				
				
//			30.	Wap to print Fibonacci series up to n terms.
					
					System.out.println("");
					System.out.println("fibonacci numbers: ");
					int f = 10, num1= 0, num2 = 1, sumnum = 0;
					
					System.out.println(f);
					
					for(int i = 0; i <= f; i++) {
						
						System.out.print(num1 + " ");
						
						sumnum = num1 + num2;
						
						num1 = num2;
						num2 = sumnum;
						
					}
}
}
