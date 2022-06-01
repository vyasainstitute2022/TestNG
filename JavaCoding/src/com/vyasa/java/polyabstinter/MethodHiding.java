package com.vyasa.java.polyabstinter;


class A {
	
	
	static void m1()  
	{
		System.out.println("from base class static method m1 ");
	}
	
	void m2()
	{
		System.out.println("from base class non static method m2 ");//7
	}
	
}

class B extends A{
	
	static void m1()   //method hiding
	{
		System.out.println("from derived class static method m1 ");
	}
	
	void m2()   //method overriding 
	{
		System.out.println("from derived class  non static method m2");//8
	}
			
}


public class MethodHiding {

	//method hiding method will call based on ref type
	public static void main(String[] args) {
	
			B b=new B();  //derived obj
			b.m1(); //derived    hiding
			b.m2();//derived    overriding
			
			A b1=new A();   //base object
			b1.m1();//base  hiding
			b1.m2();//base  overriding
			
			//derived object assigning to base reference variable called dynamic dispatch  		
			A b3=new B(); 
			b3.m1();   //base  hiding
			b3.m2(); //derived overriding
	}
}
