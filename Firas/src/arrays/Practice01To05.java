package arrays;

public class Practice01To05 {
	
public static void main(String[] args) {
	
	
//	1.	wap to create and print array using without loop
	
	String arrSt[] = {"cars", "bikes", "trucks", "bicycles"};
	
	System.out.println("arrSt[" + 0 + "]" + " = " + arrSt[0]);
	System.out.println("arrSt[" + 1 + "]" + " = " + arrSt[1]);
	System.out.println("arrSt[" + 2 + "]" + " = " + arrSt[2]);
	System.out.println("arrSt[" + 3 + "]" + " = " + arrSt[3]);
	
	
// 2.	wap to create and print array using loop
	System.out.println("\n");
	
	int arr[] = {3, 5, 7, 22, 56};
	
	for(int num = 0;num < arr.length; num++) {
		
		System.out.println("arr[" + num + "]" + " = " + arr[num]);
	}
	
	
//	3.	wap to find length of an array
	
	System.out.println("");
	System.out.println("length of array: ");
	String arrSt2[] = {"cars", "bikes", "trucks", "bicycles"};
	
	System.out.println(arrSt2.length);
	
	
//	4.	wap to print only odd number from an array
	
		int odd[] = {84, -39, 5, 23,45, -87, -255, -35, 64, 63, 22, 68, 17, 36, 92};
		
		System.out.println("");
		System.out.println("odd elements in the array: ");
		for(int i = 0; i < odd.length; i++) {
			if(odd[i] % 2 != 0)
				System.out.print("odd[" + i + "]" + " = " + odd[i] + ", ");
		}
		
		
//	5.	wap to print only even number from an array
		
		int even[] = {9, 5, -34, 6, 8, 0, 37, 50, 72, -96, 82, 11, 22, -24};
		
		System.out.println("\n");
		System.out.println("even elements in the array: ");
		for(int j = 0; j < even.length; j++) {
			if(even[j] % 2 == 0) {
				System.out.print("even[" + j + "]" + " = " + even[j] + ", ");
			}
		}
}
}
