package com.care.quiz01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String path = "classpath:application_quiz01.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		PrintBean pB = ctx.getBean("pb", PrintBean.class);
		
		pB.setPrint("spring은 어려워");
		pB.print();
	}
}
