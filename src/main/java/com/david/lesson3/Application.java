package com.david.lesson3;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
public static void main(String args[]){
	FileSystemXmlApplicationContext app=new FileSystemXmlApplicationContext("spring.xml");
	Zurassic zurassic=(Zurassic)app.getBean("zurassic");
	System.out.println(zurassic.toString());
	app.close();
}
}
