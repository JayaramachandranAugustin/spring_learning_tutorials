package com.david.lesson7;

public class Ducati {
	String stroke;
	int cost;
	int releaseYear;
	Bike bike;

Ducati(String stroke,int cost,int releaseYear,Bike bike){
	this.stroke=stroke;
	this.cost=cost;
	this.releaseYear=releaseYear;
	this.bike=bike;
}

@Override
public String toString() {
	return "Ducati [stroke=" + stroke + ", cost=" + cost + ", releaseYear=" + releaseYear + ", bike=" + bike + "]";
}

}
