package second;

public class TernaryNested3 {

	public static void main(String[] args) {
		
		int x=19, y=21, z=10;
		
		int r = x>y ? y : (z==x?x:z);
		
		System.out.println("result: "+r);
		
		boolean b = x!=z ? true : false;
		
		System.out.println(b);
		
		boolean a = true;
		
		
	}
}
