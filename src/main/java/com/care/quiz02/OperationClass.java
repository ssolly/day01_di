package com.care.quiz02;

public class OperationClass {
	
	public int operation(int num1, int num2, String op) {
		int result = 0;
		if (op.equals("+")) {
			result = num1+num2;
		} else if (op.equals("-")) {
			result= num1-num2;
		} else if (op.equals("*") || op.equals("x")) {
			result=num1*num2;
		} else if (op.equals("/")) {
			result=num1/num2;
		} else {
			result=-1;
		}
		return result;
	}
}
