package com.vyasa.java.basics;

public class DataTypeFloat {
	//double
	float f1;
	float f2=678268.84343972958F;
	float f4=678268.84343972958F;
	float f23=(float)678268.84343972958;
	double d1=6.8645435;
	double d2=1.8643575574574745745;
	
	public static void main(String[] args) {
		DataTypeFloat  obj=new DataTypeFloat();//create object in main method  
		// nameofclass   objectrefname=new nameofclass();
		System.out.println(obj.f1); 
		System.out.println(obj.f2);  
		System.out.println(obj.f4);  
		System.out.println(obj.f23);  
		System.out.println(obj.d1); 
		System.out.println(obj.d2);
		System.out.println(obj.f2+obj.f4); 
		System.out.println(obj.d2+obj.d1); 
	}		
}

//float      .1234567                                        
 //double    .123456789123456