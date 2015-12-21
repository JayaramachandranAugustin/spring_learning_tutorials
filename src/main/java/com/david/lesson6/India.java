package com.david.lesson6;

public class India {
	int noOfPlayers;
	String captain;

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	@Override
	public String toString() {
		return "India [noOfPlayers=" + noOfPlayers + ", captain=" + captain + "]";
	}

}
