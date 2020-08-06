package org.oper;

public class ArrayOperationImpl implements ArrayOperation {


//this is a print greatest number method
	@Override
	public void printgreatest(int b[] ) {
		
		int great=b[0];
		
		for(int i=1; i<b.length ;i++){
		if (great<b[i]) {
			
			great=b[i];
	}
}
		System.out.println("The greatest number is: "+ great);

	}

//this is a print smallest number method	
	@Override
	public void printsmallest(int a[]) {
		
		int small=a[0];

		for(int i=1; i<a.length ;i++){
	
	if (small>a[i]) {
		small=a[i];
	}
}

		System.out.println("The Smallest number is: "+ small);
	}

//this is a sum method
	@Override
	public void printsum(int[] c) {
		int sum = 0;
		
		for(int a=0 ; a<c.length ; a++) {
			sum = sum + c[a];
		}
		
		System.out.println("sum : "+sum);
		}
	
//this is a print Even number method
	@Override
	public void printeven(int[] d) {
		
		for(int i=0 ; i<d.length ; i++) {
			
			if(d[i]%2==0) {
				
				System.out.println("Even num  :"+d[i]);
		
		}
	}
}

//this is a print Odd number method
	@Override
	public void printodd(int[] e) {
		
		for(int i=0 ; i<e.length ; i++) {
			
			if(e[i]%2!=0) {
				
				System.out.println("Odd num  :"+e[i]);
		
			}
		}
	}

//this is a print number method
	@Override
	public void printnum(int f[] ) {

		for(int i=1 ; i<=10 ; i++) {
			
			System.out.println(i);
		
	}
}

//this is a print positive number method
	@Override
	public void printpositive(int g[] ) {

		for(int i=0 ; i<g.length ; i++) {
			
			if(g[i]>0) {
				
				System.out.println("Positive num  :"+g[i]);
			}
		}
	}
	
//this is a print Negative number method
	@Override
	public void printnegative(int h[] ) {

		for(int i=0 ; i<h.length ; i++) {
			
			if(h[i]<0) {
				
				System.out.println("Negative num  :"+h[i]);
			}
		}
	}

//this is a Average method
	@Override
	public void printaverage(double j[] ) {
	
		int k = 0;
		
		for(int i=0 ; i<j.length ; i++) {
			
			k+=j[i];
			}
				
				System.out.println((double)k/j.length);
	}

//this is a print Copy Array method
	@Override
	public void printcopyarray(int[] m) {
		
		int[] b = new int [m.length];
		
		for(int i=0 ; i<m.length ; i++) {
			b[i]=m[i];
		}
		for(int c=0 ; c<b.length ; c++) {
			System.out.println("b ["+c+"] : "+b[c]);
		
		}
	}
}


	
		
	


