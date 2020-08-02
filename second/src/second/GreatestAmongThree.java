package second;

public class GreatestAmongThree {

	public static void main(String[] args) {
		
		int a=100, b=30, c=20;
		
		int result = a>b ? a>c?a:c : b>c?b:c;
		
		System.out.println("result: "+result);
		
	}
}
