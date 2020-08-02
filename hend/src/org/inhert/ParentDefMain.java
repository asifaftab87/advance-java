package org.inhert;

public class ParentDefMain {
	
	public static void main(String[] args) {
		
		//no parent child relation but same package
		ParentDef pd = new ParentDef();
		pd.s = 4;	
		pd.i = 3;	//default
		pd.t = 8;	//protected
		
		pd.publ();
		pd.defal();
		pd.prtctd();
		
	}

}
