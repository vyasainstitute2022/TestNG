package com.vyasa.java.conditionalstatements;

public class IfExample2 {

	
   void myMethod()
	{
			int age=23;   
		 
    	 int weight=70;
    	 
    	  if(age>=18)  //18>=18     
    	  {
               if(weight>50){ 
                    System.out.println("You are eligible to donate blood");	
                } else{ 
                    System.out.println("You are not eligible to donate blood");	
                } 
          }else{ 
    	         System.out.println("Age must be greater than 18"); 
    	       	} 
    	  
    	  System.out.println("outside of if else blocks");	
    	  
	}

	public static void main(String[] args) {
		
		IfExample2  obj=new IfExample2();
		obj.myMethod();
	}
}
