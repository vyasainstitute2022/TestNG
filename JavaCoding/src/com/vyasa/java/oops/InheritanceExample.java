package com.vyasa.java.oops;

class BaseClass{
	  int a=20,b=30;
	
	void displayA()
	  {
		  System.out.println("i am from base class ==>a :"+a);
	  }
	 void displayB()
	  {
		  System.out.println("i am from base class ==>b :"+b);
	  }
	 
 }


class DerivedClass extends BaseClass{
	
	int x=100,y=200;
	
	//base class content is available here
	
	void displayX()
	{
		System.out.println("i am from derived class ==>x :"+x);
	}
	void displayY()
	{
		System.out.println("i am from derived class ==>y :"+y);
	}
		
}


class InheritanceExample {

	public static void main(String[] args) {
		
		DerivedClass d=new DerivedClass();  //  refname  derived object derived
		BaseClass b=new BaseClass();        //  refname  base    object base 
		BaseClass b1=new DerivedClass();     //base refname  and derived object
		
		
		//DerivedClass d1=new  BaseClass();   //problem is with constructor calling.
		
		// all the content from base and also from derived
		d.displayA();
		d.displayB();
		d.displayX();
		d.displayY();
   		d.a=500;
		
		// base class objct only base class contentcan access
		b.displayA();
		b.displayB();
		b.a=1000;
		
		// base ref and derived object
		b1.a=5000;
		b1.displayA();
		b1.displayB();
		
	}
}
