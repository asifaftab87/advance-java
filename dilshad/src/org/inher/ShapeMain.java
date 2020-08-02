package org.inher;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape shape = new Triangle();
		ShapeUtil.display(shape);
		
		shape = new Square();
		ShapeUtil.display(shape);
		
		shape = new Circle();
		ShapeUtil.display(shape);
	}
}
