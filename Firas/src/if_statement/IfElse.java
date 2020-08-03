package if_statement;

public class IfElse {

	public static void main(String[] args) {
		
		// 1. wap to find a number is negative or not?
		
				int a = -45;
				
				if(a < 0)
					System.out.println("negative");
				else
					System.out.println("positive");
				
				
		// 2. 2. wap to print zero if number zero, 1 if positive and -1 if number is negative

				int num = 1;
				if(num <= 0) {
					if(num == 0) { 
						System.out.println("zero");
				}
					else
					if(num == -1)
						System.out.println("-1");
				}
				else
					if(num == 1)
					System.out.println("1");
				
				
		// wap to print odd if number is odd and even if number is even
				
				int oddEven = 3;
				
				if(oddEven % 2 != 0)
					System.out.println("odd");
				else
					System.out.println("positive");
				
				
		// 4. wap to check whether number is less than 100 or not
				
				double n = 24;
				
				if(n < 100)
					System.out.println("number is less than 100");
				else
					System.out.println("end");
				
				
		// 5. wap to check whether number is between -100 to 50
				
				float f = 464.4f;
				
				if(f > -100) {
					if(f < 50)
						System.out.println("number is within range");
				
				else
					if(f < -100 || f > 50)
					System.out.println("number is outside range");
				}
				
				
		// 6. wap to print whether number is divisible by 3 or not
				
				
				
		// 7. wap to print any number by diving 7		
				
		// 8. wap to print hi if number is zero and hello if number is 100
				
				long figure = 0;
				if(figure == 0)
					System.out.println("hi");
				if(figure == 100)
					System.out.println("hello");
				
		// 9. wap to print double if number is a double digit 
				
				int dble = 34;
				
				if(dble > 9) {
					if(dble < 100)
						System.out.println("number is double-digit");
					else
						System.out.println("out");
				}
		
				
		// 10. wap to print single if number is single digit
				
				int sngle = 5;
				
				if(sngle >= 0) {
					if(sngle < 10)
						System.out.println("number is single-digit");
					else
						System.out.println("end");
				}
				
				
		// 11. wap to print ternary if number is 3 digit
				
				int ter = 547;
				
				if(ter >= 100) {
					if(ter < 1000)
						System.out.println("ternary");
					else
						System.out.println("not ternary");
				}
					
				
		// 12. wap to print 100 if number is between 100 to 200
				
				int btwn = 104;
				
				if(btwn > 100) {
					if(btwn < 200)
						System.out.println(btwn + " is within range");
					else
						System.out.println(btwn + " is outside range");
				}
				
				
// 13. wap to find biggest number among two numbers
				
				int a1 = 834, b1 = 324;
				
				if(a1 > b1)
					System.out.println(a1 + " is biggest number");
				else
					System.out.println(b1 + " is the biggest");
				
				
// 14. wap to find biggest number among three numbers
				
				int a2 = 765, b2 = 96, c2 = 5995;
				
				if(a2 > b2) {
					if(a2 > c2) { 
						System.out.println(a2 + " is the biggest");
					}
					else
						if(b2 > c2)
						System.out.println(b2 + " is the biggest");
				else
					System.out.println(c2 + " is the biggest");
				}		
				
				
				
// 15. wap to find least number among two numbers
				
				int first = 5, second = 2;
				
				if(first < second)
					System.out.println(first + " is the lowest number");
				else
					System.out.println(second + " is the lowest number");
				
				
		// 16. wap to find least number among three numbers
				
				int car = 43, bike = 4493, truck = 22;
				
				if(car < bike) {
					if(car < truck) {
						System.out.println(car + " is the lowest");
					}
						else
						if(bike < truck)
							System.out.println(bike + " is the lowest");
				
				else
					System.out.println(truck + " is the lowest");
				}
				
				
				
		// 17. wap to check whether a given character is capital 'A' or not 
				
				char letter = 'A';
				if(letter == 'A') 
						System.out.println("yes");
					else
						System.out.println("no");
				
		// 18. wap to print 'up' if any given character is upper case
				
				char upper = 'F';
				
				if(upper >= 'A') {
					if(upper <= 'Z')
						System.out.println("up");
					else
						System.out.println("end");
				}
				
				
				
		// 19. wap to print 'low' if any given character is lower case
				
				char lower = 'f';
				
				if(lower >= 'a') {
					if(lower <= 'z')
						System.out.println("low");
					else
						System.out.println("end");
				}
				
		// 20. wap to print 'num' if any given character is char numeric e.g. '1' or any such given numebr
				
				char numeric = '6';
				
				if(numeric >= 48) {
					if(numeric <= 57)
						System.out.println("num");
					else
						System.out.println("");
				}
		
				
		// 21. wap to check whether a given number is positive and double digit or single digit number 
				
				int pos = 34;
				
				if(pos > 9 && pos < 100) {
						if(pos >= 0)
							System.out.println("positive and double-digit");
					}
						else
							if(pos < 9) {
							System.out.println("positive and single-digit");
					}	
					
				
// 22. wap to print kid if age<13, print teenage if age<18 but age>12 and adult if age>18 		
	
				int age = 18;
				
				if(age < 13) {
					System.out.println("kid");
				}
					else
					if(age > 12 && age < 18) {
						System.out.println("teenage");
					}
					else
						if(age > 18)
							System.out.println("adult");
				
	}

}
