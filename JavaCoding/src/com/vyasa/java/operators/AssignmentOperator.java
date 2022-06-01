package com.vyasa.java.operators;

public class AssignmentOperator {
	public static void main(String[] args) {
	    int x=5,y=3;
		System.out.println(x=y);
		System.out.println(x=5);
		System.out.println(y=3);
		System.out.println(x+=y);//x=x+y  x=5+3 ==>  x=8 
		System.out.println(x-=y);//x=x-y  x=8-3===>  x=5
		System.out.println(x*=y);//x=x*y  x=5*3=====>x=15
		System.out.println(x/=y);//x=x/y  x=15/3  ====>x=5 
		System.out.println(x%=y);//x=x%y   x=5%3  ====>x=2
				
	}
}

