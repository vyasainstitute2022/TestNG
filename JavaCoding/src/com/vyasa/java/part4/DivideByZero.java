package com.vyasa.java.part4;
//exception Handling


public class DivideByZero {

	public static void main(String[] args) {

		int x=10,y=0;
		
		System.out.println("outside try");
		
		try {
			//risky code
			System.out.println("before exception inside try");
			System.out.println(x/y);
			System.out.println("inside try");
			//code for file opening 
			//data bases connection 
			}

		catch(ArithmeticException a)
		{
			System.out.println("inside catch");
			System.out.println("Enter the value of y as non zero number");
			a.printStackTrace();
		}
		finally
		{
			//used for cleanup code
			// close db
			//close file
			System.out.println("i am from finally");
			
		}
	}
}
