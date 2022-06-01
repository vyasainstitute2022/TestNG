package com.java.vyasa.string;


public class StringBufferExample {

	public static void main(String[] args) {
	     //mutable  thread safe 
		StringBuffer sb=new StringBuffer("ATM");
		
		System.out.println(sb);
		sb.append("Money");
		
		System.out.println(sb);
		sb.replace(1, 2, "Bank");
		System.out.println(sb);
		System.out.println(sb.delete(1, 5));
	}

}
