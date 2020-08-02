package org.abstrct;

public class DroneMain {

	public static void main(String[] args) {
		
		Drone drone = new DroneChild();
		drone.print();
		drone.fun();
	}
}
