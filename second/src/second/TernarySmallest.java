package second;

public class TernarySmallest {

	public static void main(String[] args) {
		
		int x=-9, y=1;
		
		int r = x>y&&++x==-8 ? x : y;
		
		System.out.println("result: "+r);
		System.out.println("x: "+x);
	}
}
