package com.vyasa.java.basics;

public class DataTypeInt {
	
	int i;
	int i1=342234;
	int i2=-764918269;
	int i3=2147483647;//max
	int i4=-2147483648;//min
	int i5=(int)2147483648L;   //data loss
	int i6=(int)-2147483649l;
	int i11=372384;
	int i22=(int)8660242427l;
	long i33=8660242427L;
	long i34;
	
	
	public static void main(String[] args) {
		DataTypeInt  obj=new DataTypeInt();//create object in main method  
		// nameofclass   objectrefname=new nameofclass();
		System.out.println(obj.i); 
		System.out.println(obj.i1);      
		System.out.println(obj.i2);
		System.out.println(obj.i3);
		System.out.println(obj.i4);
	    System.out.println(obj.i5);
	    System.out.println(obj.i6);
	    System.out.println(obj.i22);
	    System.out.println(obj.i33);
	    System.out.println(obj.i34);
	}		
}
