package com.vyasa.java.basics;

public class DataTypeChar {
	
	char ch;//default 
	char ch1='a';//a
	char ch2='2';//2
	char ch7='$';
	
	char ch4=78; //?  ascii => char
	int ch6='A';//? char=>ascii
	
	char ch5='\u3456';//?
	//char ch3='OK'; //not possible
	
	public static void main(String[] args) {
		DataTypeChar  obj=new DataTypeChar();//create object in main method  
		System.out.println(obj.ch);
		System.out.println(obj.ch1);
		System.out.println(obj.ch2);
		System.out.println(obj.ch4);
		System.out.println(obj.ch5);
		System.out.println(obj.ch6);
		System.out.println(obj.ch7);
	}
}
