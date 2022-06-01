package com.vyasa.java.conditionalstatements;

public class ElseIfExample {


	public static void main(String[] args) {
    int time=20;
  
    
    if(time<12)  //20<12  8<12   13<12
    {
    System.out.println("Good Morning");
    }else if(time<16)  //20<16    13<16
    		{
    		System.out.println("Good afternoon");
    		}else if(time<18)  //20<18
    		  {
    			System.out.println("Good Evng");
    		   }else 
    		      {
    			   System.out.println("Good Night");
    		     }
    
    System.out.println("continue next code");
    
	}
}
