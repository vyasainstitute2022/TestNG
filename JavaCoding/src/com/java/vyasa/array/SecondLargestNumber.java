package com.java.vyasa.array;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int a[]=new int[] {5,3,1,10,2};
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
			
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		System.out.println("largest value:"+a[a.length-1]);
		System.out.println("second largest value:"+a[a.length-2]);
		
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}
	}

}
