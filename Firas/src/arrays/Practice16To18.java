package arrays;

import java.util.Arrays;

public class Practice16To18 {

	public static void main(String[] args) {

		
// 16. wap to reverse an array

		int arr[] = {1, 5, 7, 9, 11, 13};
		
	// before reversing
		System.out.println("array before reverse");
		
		for(int n = 0; n < arr.length; n++) {
			System.out.print("arr[" + n + "]" + " = " + arr[n] + ", ");
		}
		
	// reversing process
		
		for(int n = 0, m = arr.length-1; n < m; n++, m--) {
			int temp = arr[n];
			arr[n] = arr[m];
			arr[m] = temp;
		}
		
	// after reversing
		System.out.println("\n");
		System.out.println("array after reversing");
		
		for(int n = 0; n < arr.length; n++) {
			System.out.print("arr[" + n + "]" + " = " + arr[n] + ", ");
		}
		
			
// 17. wap to copy two arrays into one array
		
		System.out.println("\n");
		int arr1[] = {0, 2, 4, 6};
		int arr2[] = {1, 3, 5, 7, 9};
		
		int length = arr1.length + arr2.length;			// store both arrays in int 'length'
		
		int result[] = new int [length];				// create an array for that int
		
		int p = 0;
		for(int element : arr1) {
			result[p] = element;
			p++;

		}
		
		for(int element : arr2) {
			result[p] = element;
			p++;
		}
		
		System.out.println("result: " + Arrays.toString(result));
		
		
// 18. wap to add two array elements n copy into third array
		
		System.out.println("\n");
		System.out.println("final array");
		int array1[] = {1, 2, 3, 4};			// store the elements of both arrays in an int variable
		int array2[] = {5, 6, 7, 8, 9, 10};		// create an array for that int
		
		int element = array1.length + array2.length;
		int array3[] = new int [element];
		
		int copy = 0;
		for(int num : array1) {
		array3[copy] = num;
			copy++;
		}
		
		for(int num : array2) {
		array3[copy] = num;
			copy++;
		}
		
		System.out.println(Arrays.toString(array3));

	}
}
