package com.david.lesson2;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TalkingApp {
	public static void main(String args[]) {
		FileSystemXmlApplicationContext context=new FileSystemXmlApplicationContext("spring.xml");
		//French french=(French)context.getBean("french");
		French french=context.getBean(French.class);
		french.speak();
		context.close();
	}
}
