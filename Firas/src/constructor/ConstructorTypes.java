package constructor;

public class ConstructorTypes {
	
	/* Three types of constructors
	 * 
	 * 1. no-arg constructor: it does not have any parameters or arguments 
	 */
	private String f;

	
	private ConstructorTypes() {
		
		f = "constructor types";
		
		System.out.println("display phrase");
		
	}
	
	
	public static void main(String[] args) {
		
		ConstructorTypes no_arg = new ConstructorTypes();
		
		System.out.println(no_arg.f);
	}
}
