package org.oper;

public class ArrayOperationImplMain {

	public static void main(String[] args) {
		
		ArrayOperation oper1 = new ArrayOperationImpl();

		int c[] = {34, 65, 89, 76, 2};
		
		oper1.printgreatest(c);
		
		ArrayOperation oper2 = new ArrayOperationImpl();

		int d[] = {34, 65, 89, 76, 2};
		
		oper2.printsmallest(d);
		
		ArrayOperation oper3 = new ArrayOperationImpl();

		int e[] = {5, 6, 2, 3};
		
		oper3.printsum(e);
		
		ArrayOperation oper4 = new ArrayOperationImpl();

		int f[] = {5, 6, 2, 3};
		
		oper4.printeven(f);
		
		ArrayOperation oper5 = new ArrayOperationImpl();

		int g[] = {5, 6, 2, 3};
		
		oper5.printodd(g);
		
		ArrayOperation oper6 = new ArrayOperationImpl();

		int h[] = {10};
		
		oper6.printnum(h);
	
		ArrayOperation oper7 = new ArrayOperationImpl();

		int i[] = {10, -3, -7, 87, 76};
		
		oper7.printpositive(i);
		
		ArrayOperation oper8 = new ArrayOperationImpl();

		int j[] = {10, -3, -7, 87, 76};
		
		oper8.printnegative(j);
		
		ArrayOperation oper9 = new ArrayOperationImpl();

		double[] l = {10, 3, 7, 87, 76};
		
		oper9.printaverage(l);
		
		ArrayOperation oper10 = new ArrayOperationImpl();

		int [] n = {1, 2 ,3 ,4 ,5};
		
		oper10.printcopyarray(n);
		
	}

}
