package com.vyasa.java.basics;

public class Student {
	
	int rollNo;   //declaration
	double m1,m2,m3;
	long mobNo;
	String sName,address;
	static String branchName="Mech",cName="IIIIT";
	
	
	                       //parameter or method  signature  //formal parameters
	void setData(int roll,double m11,double m22,double m33,long mob,String name,String add)
	{
		rollNo=roll;   //var intialiazation
		m1=m11;
		m2=m22;
		m3=m33;
		mobNo=mob;
		sName=name;
		address=add;
	}
	
	void display()
	{
		System.out.println("***************************************");	
		System.out.println("Student Information is as Follow....!!!");	
		System.out.println("***************************************");	
		System.out.println(" roll no is:"+rollNo);
		System.out.println(" m1:"+m1);
		System.out.println(" m2:"+m2);
		System.out.println(" m3:"+m3);
		System.out.println(" mobNo:"+mobNo);
		System.out.println(" sName:"+sName);
		System.out.println(" address:"+address);
		System.out.println(" branchName:"+branchName);
		System.out.println(" cName:"+cName);
		System.out.println("_____________________________________");		
	}
	
	
	  public static void main(String[] args) {
		  
		  Student  s1=new Student();  ///1st student 
		  s1.setData(001, 100, 205, 305, 1234577, "Ramesh2", "pune");//actual parameters
		 // Student.cName="AIM";
		  s1.display();
		  
		  Student s2=new Student();//2 nd student
		  s2.setData(002, 1000, 2000, 3000, 0000001111, "Suresh", "Bang");
		  s2.display();
		  
		  Student s3=new Student();//3 nd student
		  s3.setData(003, 10000, 20000, 30000, 1111000111, "Mukesh", "Hyd" );
		  s3.display();
		  
		  
	}
}