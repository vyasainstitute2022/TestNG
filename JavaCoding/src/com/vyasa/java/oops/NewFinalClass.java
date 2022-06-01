package com.vyasa.java.oops;

public class NewFinalClass extends FinalClass{

	final int x=50;
	void display()
	{
		System.out.println(x);
	}
		
	void m1()   //Overriding
	{
		System.out.println("i dont want to use base class m1 i have own");
		System.out.println("some ");
		System.out.println("etc.....");
	}
	
		
	public static void main(String[] args) {
		NewFinalClass obj=new NewFinalClass();
		System.out.println("output of x from main :"+obj.x);
		//obj.x=600;   final var can't changed
		obj.display();
		obj.m1();
	}

}
