package arrays;

public class Practice06To10 {

	public static void main(String[] args) {
		
//	6.	wap to print only positive number from an array
		System.out.println("only positive elements in the array: ");
		int positive[] = {40, -433, 3, -15, -2, -35, -6, -42, 44, 73, 45, 76, -6, 8};
		
		for(int p = 0; p < positive.length; p++) {
			
			if(positive[p] >= 0)
				System.out.print("positive[" + p + "]" + " = " + positive[p] + ", ");
		}
		

//	7.	wap to print only negative number from an array

		int neg[] = {3, 65, -3, 23, 78, -54, -335, 896, 6, -64, -7, -73};
		System.out.println("\n");
		System.out.println("only negative elements in the array: ");
		for(int n = 0; n < neg.length; n++) {
			if(neg[n] < 0)
				System.out.print("neg[" + n + "]" + " = " + neg[n] + ", ");
		}
		
		
//	8.	wap to print number divisible by given number from an array
		
		int arr[] = {3, 6, 8, 34, 67, 2, 86, -4, -743, 1, 20};
		int i = 40;
		
		System.out.println("\n");
		for(int a = 0; a < arr.length; a++) {
		if(i % arr[a] == 0)
			System.out.println("40 is divisible by arr[" + a + "]");
			}
		
//	9.	wap to print number not divisible by given number from an array

		int arr2[] = {3, 6, 8, 34, 67, 2, 86, -1, -4, 8, 10};
		int j = 80;

		System.out.println("\n");
		for(int b = 0; b < arr2.length; b++) {
			if(j % arr2[b] != 0)
				System.out.println("80 is not divisible by arr2[" + b + "]");

		}
		
//	10.	wap to print array in reverse order
		
		int ar[] = {8, 6, 4, 2};
		
		System.out.println("\n");
		System.out.println("before reverse: ");
		
	// array before reversing
		for(int x = 0; x < ar.length; x++) {
			System.out.print("ar[" + x + "]" + " = " + ar[x] + ", ");
		}
		
		System.out.println("\n");
		System.out.print("after reverse: ");

		System.out.println("");
		// reversing process
		for(int x = 0, y = ar.length - 1; x < y; x++, y--) {
			int temp = ar[x];
			ar[x] = ar[y];
			ar[y] = temp;
		}
	
	// after reverse
		for(int x = 0; x < ar.length; x++) {
			System.out.print("ar[" + x + "]" + " = " + ar[x] + ", ");
		}


		
		
		
	}
}
