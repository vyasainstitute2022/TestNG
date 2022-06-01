package com.vyasa.java.polyabstinter;


abstract class Sample
{
	
	abstract void m1();//abstract method 
	
	 void m2()  
	{
		System.out.println("concrete method");
	}
}

class derived extends Sample{

	void m1() {
		System.out.println("i am concrete method now");
	}
}

public class Abstarction {
	
	public static void main(String[] args) {
		
		derived d=new derived();
		d.m1();
		d.m2();
		
		Sample s=new derived();// ref of abstract with derived object
		s.m1();
		s.m2();
		
		//Sample s1=new Sample();  not allowed as sample is abstract class 
	
	}

}
