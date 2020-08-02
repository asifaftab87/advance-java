package org.inhert.override;

public class ShapeMainReal {

	public static void main(String[] args) {
		
		CreateShape cs = new CreateShape();
		
		Shape shape = new Triangle();
		cs.create(shape);
		
		shape = new Square();
		cs.create(shape);
		
		shape = new Circle();
		cs.create(shape);
	}

}
