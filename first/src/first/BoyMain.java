package first;

public class BoyMain {

	public static void main(String[] args) {
		
		Boy boy = new Boy();
		
		boy.create("asif", 33, 65.6f, 'm');
		
		boy.display();
		
		Boy boy2 = new Boy();
		
		boy2.create("dilshad", 15, 40.1f, 'm');
		
		boy2.display();
		
	}
}
