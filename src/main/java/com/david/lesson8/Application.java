package com.david.lesson8;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
public static void main(String args[]){
	FileSystemXmlApplicationContext appCon=new FileSystemXmlApplicationContext("lesson8.xml");
	Laptop lap=(Laptop)appCon.getBean("laptop");
	System.out.println(lap.toString());
	appCon.close();
}
}
