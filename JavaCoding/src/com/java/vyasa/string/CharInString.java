package com.java.vyasa.string;

public class CharInString {

	public static void main(String[] args) {

		String str="java java java java";

		
		//solution 1:using char array
		char c[]=str.toCharArray();
			for (int i = 0; i < c.length; i++) {
			if(c[i]=='a')
			{
				System.out.println("element is present");
				System.out.println("the position of element is:"+i);
				break;
			}
			
		 }
		
		
		//solution 2:without converting string to array 
			for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a')
			{
				System.out.println("element is present");
				System.out.println("the position of element is:"+i);
				break;
			}
			
		}
		
			
			int count=0;
			//solution 3:  count the number of occurrence of char in string
			for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a')
			{
				count++;
			}
			
		}
		
			System.out.println("number of char are "+count);
	}

}
