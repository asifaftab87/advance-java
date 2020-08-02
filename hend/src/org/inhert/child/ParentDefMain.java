package org.inhert.child;

import org.inhert.ParentDef;

public class ParentDefMain {
	
	public static void main(String[] args) {
		
		//no parent child relation n different package
		ParentDef pd = new ParentDef();
		pd.s = 4;	
		//pd.i = 3;		can't default
		//pd.t = 8;		can't protected
		
		pd.publ();
//		pd.defal();
//		pd.prtctd();
		
	}

}