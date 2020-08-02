package org.inhert;

public class ParentDef {

	private int p;
	public int s;
	int i;
	protected int t;
	
	private void personal() {
		System.out.println("parent personal");
	}
	
	public void publ() {
		System.out.println("parent public");
	}
	
	void defal() {
		System.out.println("parent defal");
	}
	
	protected void prtctd() {
		System.out.println("parent prtctd");
	}
}
