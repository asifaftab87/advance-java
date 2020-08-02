package first;

public class Pattern {

	public void incr(int n) {
		
		for(int x=1; x<=n ; x++) {
			
			for(int y=1 ; y<=x ; y++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
	}
	
	public void print(int a[]) {
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
	}
	
}
