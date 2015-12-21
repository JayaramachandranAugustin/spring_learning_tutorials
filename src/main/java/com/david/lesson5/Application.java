package com.david.lesson5;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
public static void main(String args[]){
	FileSystemXmlApplicationContext appContext=new FileSystemXmlApplicationContext("lesson5.xml");
	Car car=(Car)appContext.getBean("car");
	System.out.println(car.getWheel());
	appContext.close();
}
}
