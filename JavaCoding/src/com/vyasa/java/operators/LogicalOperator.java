package com.vyasa.java.operators;

public class LogicalOperator {
	
	public static void main(String[] args) {
		int x=5,y=4;
		System.out.println(x>y && x<y);//5>4 && 5<4 true && false  false 
		System.out.println(x>y || x<y);//        true || False    true 
		System.out.println(!(x>y && x<y));//false      true
	}
}
