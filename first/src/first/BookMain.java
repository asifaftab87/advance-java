package first;

public class BookMain {

	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.generate("maths", 100, 40.33f);
		
		book.print();
	}
}
