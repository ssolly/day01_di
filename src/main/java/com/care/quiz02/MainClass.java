package com.care.quiz02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String path = "classpath:application_quiz02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		SaveClass sc = ctx.getBean("save",SaveClass.class);
		
//		sc.setNum1(10);
//		sc.setNum2(2);
//		sc.setOp("/");
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		sc.setNum1(input.nextInt());
		System.out.print("연산자 : ");
		sc.setOp(input.next());
		System.out.print("두번째 숫자 : ");
		sc.setNum2(input.nextInt());
		
		sc.operationClass();
		sc.printClass();
		
	}
}
