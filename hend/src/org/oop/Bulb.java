package org.oop;

public class Bulb {

	private boolean isOn;
	private double volt;
	
	public void set(boolean b, double v) {
		isOn = b;
		volt = v;
	}
	
	public boolean statusOfBulb() {
		return isOn;
	}
	
	public double getVolt() {
		return volt;
	}
	
}
