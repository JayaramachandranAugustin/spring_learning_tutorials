package com.david.lesson6;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
	public static void main(String args[]) {
		FileSystemXmlApplicationContext appCon = new FileSystemXmlApplicationContext("lesson6.xml");
		ODI odi = (ODI) appCon.getBean("odi");
		System.out.println(odi.toString());
		appCon.close();
	}
}
