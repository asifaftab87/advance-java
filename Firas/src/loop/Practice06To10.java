package loop;

public class Practice06To10{
	
	public static void main(String[] args) {
	
//	6.	Wap to find sum of all natural numbers between 1 to n.		
		
		int sum = 0, nom = 20;
		
		for(int num1 = 1; num1 <= nom; num1++) {
			
			sum += num1;
		}
		System.out.println("sum of natural numbers: " + sum);
		

//	7.	Wap to find sum of all even numbers between 1 to n.
	
		System.out.println("");
		int sum2 = 0, n = 20;
		
		for(int i = 1; i <= n; i+=2) {
			
			sum2 += i;
		}
		System.out.println("sum of even numbers: " + sum2);

		
//	8.	Wap to find sum of all odd numbers between 1 to n.
		System.out.println("");

		int sumOdd = 0;
		
		for(int odd = 1; odd < 20; odd++) {
			
			if(odd % 2!= 0)
			sumOdd += odd;
		}
		
			System.out.println("sum of odd numbers: " + sumOdd);
		
		
//	9.	Wap to print multiplication table of any number.
		
			System.out.println("");
			System.out.println("multiplication number of 8: ");
			
			int multi = 8, result;
			
			for(int number = 0; number <= 10; number++) {
				
				result = multi * number;
				System.out.println(multi + " * " + number + " = " + result);
			}

		
//	10.	Wap to count number of digits in a number.
			System.out.println("");

			int i = 3415, count = 1;
			
			for(;i > 10;){
				
				i = i/10;
				count++;
			}
			System.out.println("numbrt of digits: " + count);
	}
}
	














/*








*/
