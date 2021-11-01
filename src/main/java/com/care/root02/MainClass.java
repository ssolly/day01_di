package com.care.root02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String path = "classpath:applicationST.xml";	//classpath=src/main/resources의 경로, xml파일 경로
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		//xml파일 안의 bean의 정보를 가져옴
		
		STBean stBean = ctx.getBean("stb",STBean.class);	//"stb"라는 bean, 자료형은 STBean.class
		
		//STBean stBean = new STBean(); 
		//stBean.setName("임꺽정");
		//stBean.setAge(30);
		
		//stBean.setSt(new Student());
		stBean.namePrint();
		stBean.agePrint();
	}
}
