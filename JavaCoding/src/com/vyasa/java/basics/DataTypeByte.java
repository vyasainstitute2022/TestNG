package com.vyasa.java.basics;

public class DataTypeByte {
	//globally
	String b11="23";
	String b22="27";
	byte b1;
	byte b2=23;
	byte b3=27;
	byte b4=-128;
	byte b5=(byte)129;//data loss
	byte b6=(byte)-130;
	//destination =source 
	//destination < source      need type casting 
	//destination varname=(destination)value;
	
	//next level of datatype
	short s1=129;

	void display()
	{
		System.out.println("i am from dispaly method ");
	}
	
	public static void main(String[] args) {
		//local 
		
		DataTypeByte  obj=new DataTypeByte();//create object in main method  
		// nameofclass   objectrefname=new nameofclass();
		
		System.out.println(obj.b1);  //objrefname.varname     
		System.out.println(obj.b2);
		System.out.println(obj.b3);
		System.out.println(obj.b4);
		System.out.println(obj.b5);
		System.out.println(obj.b6);
		System.out.println(obj.b2+obj.b3);
		
		//objrefname.methodname()
		obj.display();
	}

}
