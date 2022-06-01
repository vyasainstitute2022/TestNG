package com.vyasa.java.conditionalstatements;

public class ForLoopExample {
	
	public static void main(String[] args) {

			for(int i=1;i<=5;i++)    
			{
				for (int j = 1; j <=i ; j++) {   
				System.out.print(i);
				}
				System.out.println();  
			}
			
			/*
			1
			12
			123
			1234
			12345
			******/
			
		
			//i=1   j=1
			//j=1    i=1    1<=1
			//j=2     i=1    2<=1
			//*
			
			//i=2  
			//j=1  i=2
			//<=2
			
	}
}
 