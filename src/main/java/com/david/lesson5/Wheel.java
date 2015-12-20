package com.david.lesson5;

public class Wheel {
	String rimType;
	String radius;

	public String getRimType() {
		return rimType;
	}

	public void setRimType(String rimType) {
		this.rimType = rimType;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Wheel [rimType=" + rimType + ", radius=" + radius + "]";
	}

}
