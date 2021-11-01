package com.care.quiz02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String path = "classpath:application_quiz02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		SaveClass sc = ctx.getBean("save",SaveClass.class);
		
		sc.setNum1(10);
		sc.setNum2(2);
		sc.setOp("/");
		
		sc.operationClass();
		sc.printClass();
		
	}
}
