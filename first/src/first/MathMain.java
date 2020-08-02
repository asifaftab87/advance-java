package first;

public class MathMain {
	
	public static void main(String[] args) {
		
		Math math = new Math();
		
		int i = 8;
		int j = 7;
		
		math.setValues(i, j);
		
		int s = math.sum();
		System.out.println("sum: "+s);
		
		s = math.sub();
		System.out.println("sub: "+s);
	}
}
