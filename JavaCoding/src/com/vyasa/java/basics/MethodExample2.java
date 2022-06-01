package com.vyasa.java.basics;

public class MethodExample2 {
	int x=40,y=50,total;
	
	public void addition()
	{
		total=x+y;
		//
		//
		//
		//100 of lines code
		//
		//
		//  reuse the code
		// clear programming 
		//Maintenance  of code is easy 
		
	}
	
	public void display()
	{
		System.out.println(total);
	}
	
	
	public static void main(String[] args) {
		
		MethodExample2 obj2=new MethodExample2();
		obj2.addition();
		obj2.display();
		
				
		obj2.addition();
		obj2.display();
		
		
		
	}
	
}
