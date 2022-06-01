package com.vyasa.java.basics;

public class DataTypeShort {
	
	short s1;
	short s2=34;
	short s3=32767;
	short s4=-32768;
	short s5=(short)32769;
	short s6=(short)-32770;
	
	public static void main(String[] args) {
		DataTypeShort  obj=new DataTypeShort();//create object in main method  
		// nameofclass   objectrefname=new nameofclass();
		System.out.println(obj.s1);      
		System.out.println(obj.s2);
		System.out.println(obj.s3);
		System.out.println(obj.s4);
		System.out.println(obj.s5);
		System.out.println(obj.s6);
	}		
}
