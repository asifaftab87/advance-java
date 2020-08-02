package kamil;

public class DivDouble3 {

	public static void main(String[] args) {
		
		boolean a = true, c = false;
		
		boolean b = a && c;
		
		//System.out.println("b: "+b);
	//	System.out.println("a: "+a);
//		System.out.println("c: "+c);

		b = a || c;
		//System.out.println("b: "+b);
		
		b= !c;
		//System.out.println("b: "+b);
		
		int i=1;
		
		b = a && (i++==1);
		
		System.out.println("b: "+b);
		System.out.println("i: "+i);
	}
}
