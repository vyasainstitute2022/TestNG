package com.vyasa.java.oops;

public class SuperThisKeywords extends SuperBase{

	int a=300;
	static int b=500;
	int x=5000;
	
	void m3()
	{
		System.out.println("i am from dervied m3 method");
		super.m1();
		System.out.println(super.x);
		System.out.println(this.x);
		System.out.println(this.a);
		System.out.println(super.y);
		this.m4();
	}
	
	static void m4()
	{
		System.out.println("i am from derived m4 method");
	}
	
	
		
	public static void main(String[] args) {
		
		SuperThisKeywords dobj=new SuperThisKeywords();
		dobj.m3();
		SuperThisKeywords.m4();
		//this.m3();  can't use inside static methods 
		//super.m1();
	}

}
