package kamil;

public class DivDouble2 {

	public static void main(String[] args) {
		
		int i = 6;
		int j = 6;
		
		boolean b = i==j;
		
		System.out.println("b: "+b);
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		
		b = i>j;
		System.out.println("b: "+b);
		
		b = i!=j;
		System.out.println("b: "+b);
		
		b = i>=j;
		System.out.println("b: "+b);
	}
}
