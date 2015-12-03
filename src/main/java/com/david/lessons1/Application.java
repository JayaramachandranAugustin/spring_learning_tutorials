package com.david.lessons1;

public class Application {
	public static void main(String args[]) {
		Drawing drawing = new Drawing();
		Shape circle = new Circle();
		drawing.setShape(circle);
		drawing.drawShape();
		Shape triangle = new Triangle();
		drawing.setShape(triangle);
		drawing.drawShape();
	}
}
