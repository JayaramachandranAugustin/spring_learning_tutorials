package com.david.lesson1;

public class Application {
	public static void main(String args[]) {
		Drawing draw = new Drawing();
		Shape triangle = new Triangle();
		draw.setShape(triangle);
		draw.drawShape();
		Shape circle = new Circle();
		draw.setShape(circle);
		draw.drawShape();
	}
}
