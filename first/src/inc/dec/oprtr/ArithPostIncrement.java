package inc.dec.oprtr;

public class ArithPostIncrement {

	public static void main(String[] args) {

		int a = 3;
		
		int b = 3 * a++;	//3 * 3 = 9
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
