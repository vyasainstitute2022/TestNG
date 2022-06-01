package com.vyasa.java.oops;

public class Derived extends Base{
	Derived(int a)
	{
		super();
		System.out.println("i am from derived 1 para con");
	}
	Derived(){
		this(10); //call constructor of same class with one para
		System.out.println("i am from derived con");
	}
	
	public static void main(String[] args) {
		Derived d=new Derived();
		Derived d1=new Derived(20);
	}
}
