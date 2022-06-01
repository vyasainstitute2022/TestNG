package com.java.vyasa.string;

public class StringLiteral {

	public static void main(String[] args) {
	
	 //without new operator(using the literals) 
	String str1="ATM";
	String str2="pune";
	String str3="testing";
	String str4="ATM";
	String str5="testing";
	String str6=str1+str2;
	
	String str=new String();
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);
	System.out.println(str6);
	
	str1="MTA";
	
	System.out.println(str1);
	System.out.println(str1==str4);
	System.out.println(str1.equals(str4));
	System.out.println(str5==str3);
	
	
	
	
	}

}
