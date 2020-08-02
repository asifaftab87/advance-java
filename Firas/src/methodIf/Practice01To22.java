package methodIf;

public class Practice01To22 {

	public static void main(String[] args) {
		int neg = -34;
		int num = 0;
		double dE = 39.04;
		float less = 8.3f;
		long b = 45060;
		int d = 15;
		int a = 0;
		int dble = 43;
		int sngle = 4;
		int trnary = 945;
		int btwn = 135;
		double big = 3.5, bigg = 245.3;
		double big1 = 9.34, big2 = 18.4, big3 = 3.0;
		double least = -34, leastt = 45;
		double least1 = 24, least2 = 4.4, least3 = -3;
		char letter = 'A';
		char upper = 'F';
		char lower = 'd';
		char number = 52;
		int pDouble = 346;
		int age = 28;
		
		
		negative(neg);
		number(num);
		oddEven(dE);
		belowHundred(less);
		between(b);
		divide(d);
		zeroHundred(a);
		doubleSingle(dble);
		singleDouble(sngle);
		ternaryNum(trnary);
		betweenNum(btwn);
		biggestNum(big, bigg);
		biggestThree(big1, big2, big3);
		leastNum(least, leastt);
		leastThree(least1, least2, least3);
		capital(letter);
		upperCase(upper);
		lowerCase(lower);
		numeric(number);
		posDouble(pDouble);
		ageMethod(age);
		
	}
	
	
	// 1. wap to find a number is negative or not?	

	static void negative(int n) {
		
		if(n < 0)
			System.out.println("this number is negative");
		else
			System.out.println("this number is not negative");
	}
	
	
	// 2. wap to print zero if number zero, 1 if positive and -1 if number is negative

		static void number(int num1) {
			
			if(num1 < 0) {
				if(num1 == 1) {
					System.out.println(1);
				}
				else
					System.out.println(0);
			}
			else
				System.out.println(-1);
				}
			
		
		// 3. wap to print odd if number is odd and even if number is even
		
		static void oddEven(double dE2) {
			
			if(dE2 % 2 == 0)
				System.out.println("odd");
			else
				System.out.println("even");
		}
		
		
		// 4. wap to check whether number is less than 100 or not

		static void belowHundred(float a) {
			
			if(a < 100)
				System.out.println("this number is less than 100");
		}
		
		
		// 5. wap to check whether number is between -100 to 50
		
		static void between(long b2) {
			
			if(b2 > -100) {
				if(b2 < 50) 
			
				System.out.println("this number is within the range");
			
			else
				System.out.println("this number is outside the range");
			}
	
		}
		
			
		// 6. wap to print whether number is divisible by 3 or not
			
			static void divide(int d) {
				if(d % 3 == 0)
					System.out.println(d + " is divisible by 3");
				else
					System.out.println(d + " is not divisible by 3");
			}

			
		// 7. wap to print any number by dividing 7
			
		
		// 8. wap to print hi if number is zero and hello if number is 100
			
			static void zeroHundred(int a) {
				
				if(a == 0)
					System.out.println("hi");
				else
					if(a == 100)
						System.out.println("hello");	
			}

			
		// 9. wap to print double if number is a double digit
			
			static void doubleSingle(int dos) { 
			
			if(dos >= 10) {
				if(dos <=99) {
					System.out.println("this number is double");
				}
			}
			else
				if(dos > 0) {
					if(dos <= 9) { 
						System.out.println("this number is single");
					}
				}
				
				else
						System.out.println("out");
			}
			
			
			// 10. wap to print single if number is 3 digits
			

			static void  singleDouble(int sngle) {
				
				if(sngle >= 0) {
					if(sngle <= 9) {
						System.out.println("this number is single-digit");
					}
					else
						System.out.println("out");
					}
				}
			
			
			// 11. wap to print ternary if number is 3 digit
			
			static void ternaryNum(int trnary) {
				
				if(trnary >= 100) {
					if(trnary < 1000) {
					System.out.println("ternary");
				}
				else
					System.out.println("out");
				}
			}
			
			
			// 12. wap to print 100 if number is between 100 to 200
			
			static void betweenNum(int btwn) {
				if(btwn > 100) {
					if(btwn < 200) {
						System.out.println("this number is within range");
					
					}
				}
					else
					System.out.println("this number is outside range");
				}

			
			
			// 13. wap to find biggest number among two numbers
			
			static void biggestNum(double big, double big2) {	
				
			if(big > big2)
				System.out.println("biggest number = "+big);
			else
				System.out.println("biggest number = "+big2);
			}
			
			
			// 14. wap to find biggest number among three numbers
			
			static void biggestThree(double first, double second, double third) {
				
				if(first > second) {
					if(first > third) {
						System.out.println(first + " is biggest number");
					}
				}
				
				else
					if(second > third) 
					System.out.println(second + " is biggest number");
				
				else
					
					System.out.println(third + " is biggest number");
				
				}
			
			
			
			// 15. wap to find Least number among two numbers
			
			static void leastNum(double least, double leastt) {
				if(least < leastt)
					System.out.println("least number = " + least);
				else
					System.out.println("least number = " + leastt);
			}
			
			
			// 16. wap to find Least number among three numbers
			
			static void leastThree(double least1, double least2, double least3) {
				
				if(least1 < least2) {
					if(least1 < least3) {
						System.out.println(least1 + " is least number");
						}
					}
				
				else
				if(least2 < least3) 
					System.out.println(least2 + " is least number");
								
				else
					System.out.println(least3 + " is least number");
					}
			
			
			
			// 17. wap to check whether a given character is capital 'A' or not 
			
			static void capital(char letter) {
				
				if(letter >= 'A')
					System.out.println("yes");
				else
					System.out.println("no");
				
			}
			
			
			// 18. wap to print 'up' if any given character is upper case
			
			static void upperCase(char lett) {
				
				if(lett >= 'A') {
					if(lett <= 'Z')
						System.out.println("uppercase");
					
					else
						System.out.println("end");
				}
			}
			
			
			// 19. wap to print 'low' if any given character is lower case
			
			static void lowerCase(char lower) {
				if(lower >= 'a') {
					if(lower <= 'z')
						System.out.println("lowercase");
				}	
					else
						System.out.println("end");
				
			}
			
			
			// 20. wap to print 'num' if any given character is char numeric e.g. '1' or any such given number
			
			static void numeric(char num) {
				
				if(num >= 48) {
					if(num <= 57)
						System.out.println("num");
				}
				else
					System.out.println("end");
			}
			
			
			// 21. wap to check whether a given number is positive and double digit or single digit number
			
			static void posDouble(int pDouble) {
				
				if(pDouble >= 0) {
					if(pDouble > 9 && pDouble < 100) {
						System.out.println(pDouble +" is positive and double-digit");
					}
				
				else
					if(pDouble < 10) 
						System.out.println(pDouble + " is psotive and single-digit");
						
				else
					System.out.println("end");
					}
			}
			
			
			
			
			// 22. wap to print kid if age<13, print teenage if age<18 but age>12 and adult if age>18
			
			static void ageMethod(int age) {
				
				if(age < 13) {
					if(age < 12)
					System.out.println("kid");
					else
					if(age < 18) {
							System.out.println("teenage");		
						}
					}
						else
						System.out.println("adult");
						
					
					
				
			
			}
			
			
			

			
			

			
			
}