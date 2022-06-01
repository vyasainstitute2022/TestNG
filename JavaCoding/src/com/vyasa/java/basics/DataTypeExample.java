package com.vyasa.java.basics;

public class DataTypeExample {
	//variable
	int a=10;
	public int pinCode=412206;
	
    //Modifier datatype   variablename=value;
	
	public static void main(String[] args) {
		DataTypeExample  obj=new DataTypeExample();
		System.out.println(obj.a);
		obj.a=1000;
		System.out.println(obj.a);
		obj.a=50000;
		System.out.println(obj.a);
	}
}
