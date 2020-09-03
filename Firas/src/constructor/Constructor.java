package constructor;

public class Constructor {

	private int dish;
	
	private Constructor(int dish) {
			
		System.out.println("the number of dishes are " + dish);
	}
	
	
	public static void main(String[] args) {
		
		Constructor breakfast = new Constructor(2);
		Constructor lunch = new Constructor(4);
		Constructor dinner = new Constructor(3);
		
// side note: arguments are passed while calling a constructor or method		
	}
}
