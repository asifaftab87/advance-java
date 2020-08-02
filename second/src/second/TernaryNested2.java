package second;

public class TernaryNested2 {

	public static void main(String[] args) {
		
		int x=19, y=16, z=30;
		
		int r = x>y ? (x>z?x:z) : 10;
		
		System.out.println("result: "+r);
	}
}
