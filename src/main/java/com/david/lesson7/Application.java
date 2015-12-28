package com.david.lesson7;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
public static void main(String args[]){
	FileSystemXmlApplicationContext appCon=new FileSystemXmlApplicationContext("lesson7.xml");
	Ducati ducati=(Ducati)appCon.getBean("ducati");
	System.out.println(ducati.toString());
	appCon.close();
}
}
