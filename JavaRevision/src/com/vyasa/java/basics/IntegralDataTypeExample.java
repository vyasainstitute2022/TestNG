package com.vyasa.java.basics;

public class IntegralDataTypeExample {

	byte b1;
	byte b2=29;
	byte b3=127;
	byte b4=-128;
	//byte b5=(byte)128;//data loss
	//byte b6=(byte)-129;
	short s1=128;
	short s2=-129;
//	short s3=-32769;
	int i3=-32769;
	int i4=32769;
	//int i5=8660242427;//lose
	long  l=866024245l;
	
	
	public static void main(String[] args) {
		
		IntegralDataTypeExample obj=new IntegralDataTypeExample();
		
		System.out.println(obj.b1);
		System.out.println(obj.b2);
		System.out.println(obj.b3);
		System.out.println(obj.b4);
		//System.out.println(obj.b5);
		//System.out.println(obj.b6);
		
		}

}
