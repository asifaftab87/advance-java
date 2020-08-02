package first;

public class CopyMain {

	public static void main(String[] args) {
		
		Copy copy = new Copy();
		
		copy.authorName = "asif";
		copy.numPages = 200;
		copy.price = 300.3f;
		
		copy.print();
	}
}
