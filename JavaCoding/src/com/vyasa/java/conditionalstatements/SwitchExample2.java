package com.vyasa.java.conditionalstatements;

public class SwitchExample2 {

	public static void main(String[] args) {

		
		switch('A')
		{
		case 'A': 
		      System.out.println("executed case A");
		      break;
		
		case 'E':
			 System.out.println("executed case E");
			 break;
		case 'I':
			 System.out.println("executed case I");
			 break;
		case 'O':
			 System.out.println("executed case O");
			 break;
		case 'U':
			 System.out.println("executed case U");
			 break;	
			 
		default :
			 System.out.println("executed case default");
			 break;
		}
		
		
		 System.out.println("outside switch statement");
	}

}
