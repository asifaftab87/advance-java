package first;

public class Book {

	private String authorName;
	private int numPages;
	private float price;
	
	public void generate(String an, int np, float pr) {
		authorName = an;
		numPages = np;
		price = pr;
	}
	
	public void print() {
		System.out.println("author name: "+authorName);
		System.out.println("number of pages: "+numPages);
		System.out.println("price: "+price);
	}
	
}
