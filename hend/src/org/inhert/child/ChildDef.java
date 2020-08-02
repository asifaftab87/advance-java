package org.inhert.child;

import org.inhert.ParentDef;

public class ChildDef extends ParentDef{

	public void child() {
		s = 8;
		//i = 7; default can't access from different package
		t = 9;
		publ();
		//defal(); default can't access from different package
		prtctd();	//can access protected
	}
}
