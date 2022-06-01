package com.java.vyasa.array;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]=new int[] {7,4,8,1,10,9,5,6};
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		
		System.out.println();
		
		System.out.println("length "+ a.length);
		
		for (int i = 0; i < a.length/2; i++) {
			temp=a[i];      //a[i]   7     a[1] =4
 			a[i]=a[a.length-1-i]; //a[5-1-0] ===> a[4]     a[5-1-1] ===> a[3]
			a[a.length-1-i]=temp;
		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		
	}

}
