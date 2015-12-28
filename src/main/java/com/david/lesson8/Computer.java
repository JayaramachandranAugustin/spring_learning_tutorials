package com.david.lesson8;

public class Computer {
	String bit;
	String harddiskSize;
	String ramMemory;

	public String getBit() {
		return bit;
	}

	public void setBit(String bit) {
		this.bit = bit;
	}

	public String getHarddiskSize() {
		return harddiskSize;
	}

	public void setHarddiskSize(String harddiskSize) {
		this.harddiskSize = harddiskSize;
	}

	public String getRamMemory() {
		return ramMemory;
	}

	public void setRamMemory(String ramMemory) {
		this.ramMemory = ramMemory;
	}

	@Override
	public String toString() {
		return "Computer [bit=" + bit + ", harddiskSize=" + harddiskSize + ", ramMemory=" + ramMemory + "]";
	}

}
