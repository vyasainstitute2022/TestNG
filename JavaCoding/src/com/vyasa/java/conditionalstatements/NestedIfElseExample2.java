package com.vyasa.java.conditionalstatements;

public class NestedIfElseExample2 {

	public static void main(String[] args) {
			int age=20; 
			int weight=70;
			
			if(age>=18){	
		        		if(weight>50){  
		             	System.out.println("You are eligible to donate blood");  
		               }	
		        		System.out.println("inside if block outside inner if");
		          } 
		}
}
