package com.vyasa.java.oops;

public class ConstructorExample {
	
	int x,y,z;
	
	void display(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	/*void ConstructorExample()   //normal method
	{
		
	}*/
	
	private ConstructorExample(){      //default Constructor
		//initialization of variables
		x=40;
		y=30;
		z=50;
	}
	
	public ConstructorExample(int a,int b){   //para Constructor 
		//initialization of variables
		x=a;
		y=b;
	}
		
	public ConstructorExample(int a,int b,int c){   //para Constructor 
		//initialization of variables
		x=a;
		y=b;
		z=c;
	}
	
		public static void main(String[] args) {

		ConstructorExample  obj1=new ConstructorExample();
		//object creating constructor gets executed 
		
		obj1.display();
		
		ConstructorExample  obj2=new ConstructorExample(100,200);
		obj2.display();
		
		ConstructorExample  obj3=new ConstructorExample(400,500); 
		obj3.display();
		
		ConstructorExample  obj4=new ConstructorExample();
		obj4.display();
		
		ConstructorExample  obj5=new ConstructorExample(1000,2000,3000);
		obj5.display();
	}
}
