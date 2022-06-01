package com.vyasa.java.operators;

//increment ++  and decrement -- operator 
public class OperatorIncDec {

	
	public static void main(String[] args) {
		int i=10;
		
		//increment ====>  5     ++i  ===>   i=i+1
		//decrement ====>  3     --i ===>   i=i-1   
		
		System.out.println(i);//10
		System.out.println("pre increment:"+ ++i);//5    11    
		System.out.println(i);//5    //11
		System.out.println("post increment:"+ i++);//5   11
		//6   12
		System.out.println(i);//6    12
		System.out.println("pre decrement:"+ --i);//5  11
		System.out.println(i);//5    11
		System.out.println("post decrement:"+ i--);//5   11
		System.out.println(i);//10
	}

}
