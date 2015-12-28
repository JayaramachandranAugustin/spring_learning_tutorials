package com.david.lesson7;

public class Bike {
	String engineCC;
	int mileage;

	public String getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Bike [engineCC=" + engineCC + ", mileage=" + mileage + "]";
	}

}
