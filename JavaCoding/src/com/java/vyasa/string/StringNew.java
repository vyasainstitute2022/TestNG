package com.java.vyasa.string;

public class StringNew {
	public static void main(String[] args) {
		
		//using new operator   no scp
		String str1=new String("ATM");
		String str2=new String("pune");
		String str3=new String("testing");
		
		String str4=new String("ATM");
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		str4.concat("Money");  //ATM Money  runtime object  new location object 
		
		
		System.out.println(str1==str4);
		System.out.println(str1.equals(str4));
	}
}

