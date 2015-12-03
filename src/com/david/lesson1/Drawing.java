package com.david.lesson1;

public class Drawing {
	Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void drawShape() {
		this.shape.draw();
	}
}
