package com.vyasa.java.part4;

public class ToString {

	
	
	public static void main(String[] args) {
	try {
	System.out.println(10/0);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
		System.out.println("1");
		System.out.println(e.getMessage());
		System.out.println("2");
		System.out.println(e.getClass());
		System.out.println("3");
		System.out.println(e.getCause());
		System.out.println("4");
		System.out.println(e.toString());
		System.out.println("4");
	}
	}

}
