package com.david.lesson4;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
public static void main(String args[]){
	FileSystemXmlApplicationContext appCon=new FileSystemXmlApplicationContext("spring.xml");
	ClassRoom cr=(ClassRoom)appCon.getBean("classroom");
	System.out.println(cr.getStudent().toString());
	appCon.close(); 
}
}
