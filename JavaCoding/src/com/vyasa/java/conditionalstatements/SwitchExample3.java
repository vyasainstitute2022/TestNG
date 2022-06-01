package com.vyasa.java.conditionalstatements;

public class SwitchExample3 {
	
	public static void main(String[] args) {
			
		switch("April")
		{
		case "Jan": 
		      System.out.println("executed case Jan");
		      break;
		
		case "Feb":
			 System.out.println("executed case Feb");
			 break;
		case "Mar":
			 System.out.println("executed case Mar");
			 break;
		case "April":
			 System.out.println("executed case April");
			 break;
		case "May":
			 System.out.println("executed case May");
			 break;	
			 
		default :
			 System.out.println("executed case default");
			 break;
		}
		
		 System.out.println("outside switch statement");
		 
	}
}
