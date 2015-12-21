package com.david.lesson6;

public class ODI {
	String venue;
	Australia aus;
	India ind;

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Australia getAus() {
		return aus;
	}

	public void setAus(Australia aus) {
		this.aus = aus;
	}

	public India getInd() {
		return ind;
	}

	public void setInd(India ind) {
		this.ind = ind;
	}

	@Override
	public String toString() {
		return "ODI [venue=" + venue + ", aus=" + aus + ", ind=" + ind + "]";
	}

}
