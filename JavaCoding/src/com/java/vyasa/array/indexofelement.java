package com.java.vyasa.array;

public class indexofelement {

	public static void main(String[] args) {
		
		int a[]=new int[] {7,4,8,1,10,9,10,6};
		
		int searchElement=10;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==searchElement)
			{
				System.out.println(i);
			}
		}
	}
}
