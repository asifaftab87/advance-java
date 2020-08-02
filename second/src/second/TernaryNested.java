package second;

public class TernaryNested {

	public static void main(String[] args) {
		
		int x=9, y=16, z=3;
		
		int r = x>y ? (x>z?x:z) : (y>z?y:z);
		
		System.out.println("result: "+r);
	}
}
