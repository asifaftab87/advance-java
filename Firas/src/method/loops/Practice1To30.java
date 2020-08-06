package method.loops;

public class Practice1To30 {
	
	public static void main(String[] args) {
		
		int natNum = 1;
		
		naturalNum(natNum);
		
		// ========================================
		
		System.out.println("\n");
		
		int rvrse = 10;
		
		naturalReverse(rvrse);
		
		// ========================================
		
		System.out.println("\n");
		
		char alp = 'a';
		
		alphabets(alp);
		
		// ========================================
		
		System.out.println("\n");
		
		int even = 0;
		
		eveNum(even);
		
		// ========================================
		
		System.out.println("\n");
		
		int odd = 0;
		
		oddNum(odd);
		
		// ========================================
		
		System.out.println("\n");
		
		int n = 0;
		
		natural(n);
		
		// ========================================
		
		System.out.println("\n");
		
		int num = 0;
		evenSum(num);
		
		// ========================================
		
		System.out.println("");
		
		int nom = 0;
		
		oddSum(num);
		
		// ========================================
		
		System.out.println("");

		int m = 0;
		
		multiTable(m);
		
		// ========================================
		
		System.out.println("");
		
		int number = 12345;
		
		countNum(number);
				
		// ========================================
		
		System.out.println("");
		
		int nombor = 129443;
		
		firstLast(nombor);
		
		// ========================================
		
		System.out.println("");
		
		int numSum = 1234564;
		
		sumFirstLast(numSum);
		
		// ========================================
		
		System.out.println("");
		
		int swpNum = 123456;
		
		swapDigit(swpNum);
		
		// ========================================
		
		System.out.println("");
		
		int sumD = 1234;
		
		sumDigit(sumD);
		
		// ========================================
	
		System.out.println("");
		
		int prD = 234;
		
		prDigit(prD);
		
		// ========================================
		
		System.out.println("");
		
		int rvrsed = 123456;
		
		reverseNum(rvrsed);
		
		// ========================================
		
		System.out.println("");
		
		int palNum = 646;
		
		palindrome(palNum);
		
		// =======================================
		
		System.out.println("");
		
		char value = 0;
		
		asciiValues(value);
		
		// =======================================
		
		System.out.println("");
		
		int po = 4;
		
		powerNum(po);

		// =======================================
		
		System.out.println("");
		
		int fact = 3;
		
		factorial(fact);
		
		
		// =======================================
		
		System.out.println("");
		
		int primeNum = 5;
		
		primeMethod(primeNum);
		
		// =======================================
		
		System.out.println("");
		
		int prime = 1;
		
		primeList(prime);
		
		
		// =======================================
		
		System.out.println("");
		
		int arm = 153;
		
		armstrong(arm);
		
		// =======================================
		
		
		
		
		
		// =======================================
		
		
		
		
		
		// =======================================
	}
	

	
// 1.	Wap to print all natural numbers from 1 to n.	
		public static void naturalNum(int num) {
		
		for(; num <= 10; num++) {
			System.out.println(num);
		}
		}

		
// 2.	Wap to print all natural numbers in reverse (from n to 1).
		
		public static void naturalReverse(int reverse) {
			
			for(;reverse > 0; reverse--){
				System.out.println(reverse);
			}

	}
	

// 3.	Wap to print all alphabets from a to z.
		
		static void alphabets(char alp) {
			
			System.out.println("the alphabets");
			for(; alp <= 'z'; alp++) {
				System.out.print(alp +" ");
			}
		}


// 4.	Wap to print all even numbers between 1 to 100.

		static void eveNum(int even) {
			
			System.out.println("even numbers");
			
			for(; even < 100; even++) {
				if(even % 2 == 0) 
					System.out.print(even + " ");
			}
		}

// 5.	Wap to print all odd number between 1 to 100.
		
		static void oddNum(int odd) {

			System.out.println("odd numbers");
			
			for(; odd < 100; odd++) {
				if(odd % 2 != 0)
					System.out.print(odd + " ");
			}
		}
	
		
		
		
// 6.	Wap to find sum of all natural numbers between 1 to n.
		
		static void natural(int num) {
			
			
			int sum = 0;
			for(int i = 0; i <= 20; i++) {

				num /= 10;
				sum = sum + i;
			}
			System.out.print("sum: " + sum);
		}

// 7.	Wap to find sum of all even numbers between 1 to n.
		
		static void evenSum(int num) {
			
		
		int sum = 0;

		for(int x = 0; x <= 20; x++) {
			if(x % 2 == 0) {
				sum  = sum + x;
			}
		}
		
		System.out.println("sum: " + sum);

	}
		
	
		
// 8.	Wap to find sum of all odd numbers between 1 to n.
		
		static void oddSum(int num) {
			
		int sum = 0;
		
		for(int n = 0; n <= 20; n++) {
			if(n % 2 != 0) {
				sum += n;
			}
		}
		System.out.println("sum: " + sum);
		}
		
		
		
//	9. Wap to print multiplication table of any number.
		
		static void multiTable(int mult) {
			
			int first = 10, m = 0;

			System.out.println("multiplication table for 10");
			for(int second = 0; second <= first; second++) {
				
				m = first * second;
			System.out.println(first + " * " + second + " = " + m);
		}
		}
		

//	10.	Wap to count number of digits in a number.
		
		static void countNum(int num) {
			
			int count = 0;
			
			for(; num != 0; count++) {
			
				num = num / 10;
			}
			
			System.out.println("number of digits: " + count);

		}

	
//	11.	Wap to find first and last digit of a number.
		
		static void firstLast(int num) {
			
		
		int first = num, last = num;
		
		
		for(; first > 10 || last > 10;) {
			
			first = first / 10;
			last = last % 10;
			num /= 10;

		}
		System.out.println("first number: " + first);
		System.out.println("last number: " + last);
		
		}
		
		
//	12.	Wap to find sum of first and last digit of a number.
		
		static void sumFirstLast(int numSum) {
			
		
		int first = numSum, last = numSum, sum = 0;
		
		for(; first > 10 || last > 10; numSum /= 10) {
			
			first /= 10;
			last %= 10;
			sum = first + last;
		}
		
		System.out.println("sum of first and last number = " + sum);
			
		}

// 	13.	Wap to swap first and last digits of a number.
		
		static void swapDigit(int swpNum) {
			
			int first = swpNum, last = swpNum, r = 0;
			
			for(; first > 10 || last > 10; swpNum /= 10) {
				
				first /= 10;
				last %= 10;
				r %= 10;
			}
			System.out.println("first digit before swaping: " + first);
			System.out.println("last digit before swaping: " + last);
			
			int temp = first;
			first = last;
			last = temp;
			
			for(; first > 10 || last > 10; r %= 10) {
				first /= 10;
				last %= 10;
			}
			System.out.println("");
			System.out.println("first digit after swaping: " + first);
			System.out.println("last digit after swaping: " + last);
			
			
		}
//	14.	Wap to calculate sum of digits of a number.
		
		static void sumDigit(int sumD) {
			
		
			int sum = 0;
		
			for(; sumD > 0;	sumD /= 10) {
				
				
				sum += sumD%10;
			}
						
			System.out.println("sum of all digits = " + sum);
		}
		
//	15.	Wap to calculate product of digits of a number.
		
		static void prDigit(int prD) {
			
			int product = 1;
			
			for(;prD > 0; prD /= 10) {
				
				product = product * (prD%10);
			}
			System.out.println("product of all digits = " + product);
		}
	
//	16.	Wap to enter a number and print its reverse.
		
			static void reverseNum(int rvrse) {
				int r = 0, reverse = 0;
				for(int i = 0; i < rvrse; rvrse /= 10) {
					
					r = rvrse % 10;
					reverse = reverse * 10 + r;
				}
				
				System.out.println("digits in reverse: " + reverse);
			}
			

//	17.	Wap to check whether a number is palindrome or not.
			
			static void palindrome(int palNum) {
			int reverse = 0, r, temp = palNum;
			for(; palNum > 0; palNum /= 10) {
				r = palNum % 10;
				reverse = (reverse * 10) + r;
			}
			System.out.println("reversed: " + reverse);
				if(temp == reverse)
					System.out.println("palindrome");
			else
				System.out.println("out");
			
			}
			
//	18.	Wap to print all ASCII character with their values.
			
			static void asciiValues(char value) {
				
				for(; value <= 255; value++) {
					
					System.out.println(value);
				}
			}
		

//	19.	Wap to find power of a number using for loop.
			
			static void powerNum(int po) {
				int expo = 3, exponent = 1;
				for(;expo > 0; expo--) {
					
					exponent = exponent * po;
				}	
					System.out.println("4 power of 3: " + exponent);
			}
			

//	20.	Wap to calculate factorial of a number.
			
			static void factorial(int fact) {
				int f = 1, fac;
				for(;fact > 0; fact--) {
					
					f = f * fact;
				}
				System.out.println("factorial of 3 = " + f);
			}
		
//	21.	Wap to check whether a number is Prime number or not.
			
			static void primeMethod(int primeNum) {
				
				int i = 2;
				for(; i < 5; i++) {
				}	
					if(primeNum/i != 0)
						System.out.println("number is prime");			
					else
				System.out.println("number is not prime");
			}

//	22.	Wap to print all Prime numbers between 1 to n.
			
			static void primeList(int prime) {
				int i, count; 
				
				System.out.println(" Prime Numbers from 1 to 100 are : ");
				
				for(; prime <= 10; prime++)
				{
					count = 0;
				    for (i = 2; i <= prime/2; i++) {
				    	if(prime % i == 0) {
				    		count++;
				    	}
				    }
				    if(count == 0 && prime != 1 )
				    {
				    	System.out.print(prime + " ");
				    }  
				}
			}

//	23.	Wap to find sum of all prime numbers between 1 to n.
			
			static void primeSum(int prSum) {

			}
//	24.	Wap to check whether a number is Armstrong number or not.
			
			static void armstrong(int arm) {
				
				int r, temp, cube = 0;
				
				temp = arm;
				
				for(;arm > 0;) {
					r = arm % 10;
					arm = arm / 10;
					cube = cube + (r * r * r);
				}
				
				if(temp == cube) {
					System.out.println("armstrong");
				}
					else
					System.out.println("not armstrong");
			}

//	25.	Wap to print all Armstrong numbers between 1 to n.
			
			static void armAll(int armNum) {
				
				int cube = 0, r, temp;
				
				temp = armNum;
				for(; armNum > 0 ;) {
					r = armNum % 10;
					armNum = armNum / 10;
					
					cube = cube + (r*r*r);
				}
			for(; armNum > 0 ;armNum++) {
				if(temp == cube) {
					System.out.println(temp);
				
			}
			}
			}
//	26.	Wap to check whether a number is Perfect number or not.

//	27.	Wap to print all Perfect numbers between 1 to n.

//	28.	Wap to check whether a number is Strong number or not.

//	29.	Wap to print all Strong numbers between 1 to n.

//	30.	Wap to print Fibonacci series up to n terms.



}
