package com.vyasa.java.part4;
//exception Handling


public class NullPointerException {

	public static void main(String[] args) {
		String s=null;
		int x=10,y=0;
		try {
			
			if(s.equalsIgnoreCase(null))
		    {
			System.out.println(s.length());
		    }
		    
		   System.out.println(x/y);
			 
		}
		
		catch(ArithmeticException a)
		{
			System.out.println("change zero");
			a.printStackTrace();
		}
		
		catch(RuntimeException n)
		{
			System.out.println("String is null");
			n.printStackTrace();
		}
		
		catch(Exception n)
		{
			System.out.println("String is null");
			n.printStackTrace();
		}
		
		finally {
			
		}
		
 }
}
