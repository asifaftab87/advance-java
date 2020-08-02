package first;

public class Math {

	private int a;
	private int b;
	
	public void setValues(int x, int y) {
		a = x;
		b = y;
	}
	
	public int sum() {
		
		int sum = a + b;
		
		return sum;
	}
	
	public int sub() {
		
		int sub = a - b;
		
		return sub;
	}
}
