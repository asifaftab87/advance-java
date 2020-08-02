package second;

public class ExtensionOfString {

	public static void main(String[] args) {
		
		String s = "hello world.Thumbs.db.wow now.Thumbs.db";
		String c = "hello world.Thumbs.db.txt";
		
		int oc = s.lastIndexOf("Thumbs.db");
		System.out.println("oc: "+oc);
		System.out.println("oc2: "+(s.length()-"Thumbs.db".length()));
		System.out.println("oc2: "+(s.length()-"Thumbs.db".length()==oc));
		
		oc = c.lastIndexOf("Thumbs.db");
		System.out.println("oc: "+oc);
		System.out.println("oc2: "+(c.length()-"Thumbs.db".length()==oc));
	}
}
