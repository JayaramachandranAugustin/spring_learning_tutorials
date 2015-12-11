package com.david.lesson3;

public class Zurassic {
	String type;
	String version;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Zurassic [type=" + type + ", version=" + version + "]";
	}

}
