package com.david.lesson8;

public class Laptop extends Computer {
	String batteryBackup;

	public String getBatteryBackup() {
		return batteryBackup;
	}

	public void setBatteryBackup(String batteryBackup) {
		this.batteryBackup = batteryBackup;
	}

	@Override
	public String toString() {
		return "Laptop [batteryBackup=" + batteryBackup + ", bit=" + bit + ", harddiskSize=" + harddiskSize
				+ ", ramMemory=" + ramMemory + "]";
	}
}
