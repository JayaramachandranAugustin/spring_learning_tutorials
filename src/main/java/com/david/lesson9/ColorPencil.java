package com.david.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ColorPencil {
String color;
@Autowired
@Qualifier("pencil1")
Pencil pencil;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Pencil getPencil() {
	return pencil;
}
public void setPencil(Pencil pencil) {
	this.pencil = pencil;
}
@Override
public String toString() {
	return "ColorPencil [color=" + color + ", pencil=" + pencil + "]";
}

}
