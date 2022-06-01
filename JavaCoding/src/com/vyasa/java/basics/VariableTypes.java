package com.vyasa.java.basics;

public class VariableTypes {
    //global varaible
	int a; //outside  method ,inside class without static keyword instance var
	//when we use instance variable inside instance method no need og object
	//when we use non static var in side static method we need to create object
	static int b;//with static keyword
	//with object or with name of the class 
	//when we use static var inside instance method no need of object
	
	
	void addition() //nonstatic methd/instance metod
	{
		int d=0,result,x=4;
		//inside the method is called local varaible 
		//static int f=40;
		result=d+a;
		System.out.println(result);
		System.out.println(d);//access is within the method
		//System.out.println(c); c is not a part of addition 
		System.out.println(a);//not created the object
		System.out.println(b);
	}
	
	static void multi() //static method
	{
		//static var?
		System.out.println(b);
		//nonstatic var?
		VariableTypes var=new VariableTypes();
		System.out.println(var.a);
		
	}
	
	//many more method
	//static method 
	public static void main(String[] args) {
		int c=5;//shold be intialized 
		VariableTypes varobj=new VariableTypes();
		System.out.println(varobj.a);//created object and used
		System.out.println(c);
		//System.out.println(varobj.b);//with object name
		System.out.println(VariableTypes.b);//with classname
		//System.out.println(result);
		//System.out.println(d); result and d variable are not part of main method
		
		System.out.println("multi method execution started");
		//call the method
		//static method ?
		VariableTypes.multi();
		System.out.println("multi method execution end");
		
		System.out.println("addition method execution started");
		//non static method ?
		varobj.addition();
		System.out.println("addition method execution end");
		System.out.println("end of main method");
		
	}
	

}
