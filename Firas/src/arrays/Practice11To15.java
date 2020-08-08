package arrays;

public class Practice11To15 {

	public static void main(String[] args) {
//	11.	wap to copy one array into other array
		
		System.out.println("first array");
		int arr[] = {8, 3, 4, 23, 10, 1};
		int arr2[] = new int [arr.length];
		
	
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
			System.out.print("arr[" + i + "]" + " = " + arr[i] + ", ");
		}
		
		System.out.println("\n");
		System.out.println("second array");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print("arr2[" + i + "]" + " = " + arr2[i] + ", ");
		}
		

		
//	12.	wap to copy an array to another array in reverse order
		
		int org[] = {2, 4, 6, 8, 10, 12, 14, 16};
		
		int rvrse[] = new int[org.length];
		
	// original array]
		System.out.println("\n");
		System.out.println("before reversing");
		for(int a = 0; a < org.length; a++) {
			
			System.out.print("org[" + a + "]" + " = " + org[a] + ", ");
		}
	
	// revering process	
		for(int a = 0, b = org.length-1; a < org.length; a++, b--) {
			rvrse[a] = org[b];
		}
		
	// second array in reverse
		System.out.println("\n");
		System.out.println("after reversing");
		
		for(int a = 0; a < org.length; a++) {
			System.out.print("rvrse[" + a + "]" + " = " + rvrse[a] + ", ");
		}

	
// 13. wap to find some of an array element
		 
		System.out.println("\n");
		float array[] = {3.5f, 67.0f, 0.9f, -6.34f, 0.001f, 34.5f};
		 
			 System.out.print("array[" + 2 + "]" + " = " + array[2]);
	
			 
// 14.	wap to find biggest number from any array
			 
			 double big[] = {4.5, 87.7, 245.0};
			 
			 System.out.println("\n");
			 if(big[0] > big[1]) {
				 
				 if(big[0] > big[2]) 
					 System.out.println(big[0] + " is the biggest");
			 }
				 else
					 if(big[1] > big[2])
						 System.out.println(big[1] + " is the biggest");
			 	 
			 else
					 System.out.println(big[2] + " is the biggest");
			 
			 
// 15.	wap to find smallest number among array element
			 
			 int small[] = {-9, -49, -100};
			 
			 System.out.println("");
			 if(small[0] < small[1]) {
				 if(small[0] < small[2]) 
					 System.out.println(small[0] + " is the smallest");
			 }
			 else
				 if(small[1] < small[2]) {
					 System.out.println(small[1] + " is the smallest");
				 }
			 else
				 if(small[2] < small[1])
					 System.out.println(small[2] + " is the smallest");
				 
			 
	}
}
