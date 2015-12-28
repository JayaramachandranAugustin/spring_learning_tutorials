package com.david.lesson9;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Applicaiton {
public static void main(String args[]){
	FileSystemXmlApplicationContext appCon=new FileSystemXmlApplicationContext("lesson9.xml");
	ColorPencil pencil=(ColorPencil)appCon.getBean("colorpencil");
	System.out.println(pencil.toString());
	appCon.close();
}
}
