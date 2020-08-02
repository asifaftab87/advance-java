package second;

public class IfElseNested {

	public static void main(String[] args) {
		
		int a=12, b=23, c=3;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a: "+a);
			}
			else {
				System.out.println("c: "+c);
			}
		}
		else {
			if(b>c) {
				System.out.println("b: "+b);
			}
			else {
				System.out.println("c: "+c);
			}
		}
	}
}
