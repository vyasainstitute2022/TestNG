package com.vyasa.java.basics;

public class MethodExample {

	int x=40,y=50,total,subValue;
	static MethodExample objsub;
	
	public void addition()//method definition 
	{
		total=x+y;
	}
	
	public void display()
	{
		System.out.println("addition of two value is:"+total);
		System.out.println("sub of two value is:"+objsub.subValue);
	}
	
	public static void sub()//static method definition 
	{
		objsub=new MethodExample();
		objsub.subValue=objsub.x-objsub.y;
	}
	
	//div
	//mul
	//mod  %
	
	public static void main(String[] args) {
		
		MethodExample obj1=new MethodExample();
		obj1.addition();//method calling
		MethodExample.sub();
		obj1.display();
	}

}
