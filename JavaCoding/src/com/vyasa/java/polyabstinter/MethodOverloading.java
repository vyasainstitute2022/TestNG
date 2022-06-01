package com.vyasa.java.polyabstinter;


public class MethodOverloading {
  
	double total;
	
	void addition(int x)
	{
		System.out.println("i am from method ovwerloading ");
		total=x+x;
	}
	void addition(int x,int y)
	{
		total=x+y;
	}
	
	void addition(int x,int y,int z)
	{
		total=x+y+z;;
	}
	
	void addition(double x,double y)
	{
		total=x+y;
	}
	
	void addition(double x,double y,double z)
	{
		total=x+y+z;
	}
	
	void display()
	{
		System.out.println(total);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		
		obj.addition(10);//during compilation 
		obj.display();
		
		obj.addition(10,20);
		obj.display();
		
		obj.addition(10,20,30);
		obj.display();
		
		obj.addition(10.5,2.1,4.6);
		obj.display();
		
		obj.addition(10.9,2.1);
		obj.display();
		
	}

}
