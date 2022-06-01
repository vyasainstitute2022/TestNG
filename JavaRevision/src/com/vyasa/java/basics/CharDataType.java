package com.vyasa.java.basics;

public class CharDataType {
//unicode   2byte 
	char c;
	char c1='A';
	char c2='2';
	char c3='$';
	
	int c4='A';
	int c5='2';
	
	public static void main(String[] args) {

		CharDataType  obj=new CharDataType();
		System.out.println(obj.c);
		System.out.println(obj.c1);
		System.out.println(obj.c2);
		System.out.println(obj.c3);
		System.out.println(obj.c4);
		System.out.println(obj.c5);
	}

}
