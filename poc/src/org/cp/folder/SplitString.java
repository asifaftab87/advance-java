package org.cp.folder;

public class SplitString {

	public static void main(String[] args) {
		
		String m = "hello_world_hi.doc_a.docs";
		String dSp[] = m.split("\\.");
		System.out.println(dSp.length);
		for(String s :dSp) {
			System.out.println(s);
			String[] ssp = s.split("_");
			for(String ss : ssp) {
				System.out.println(ss);
			}
		}
		
		
	}
}
