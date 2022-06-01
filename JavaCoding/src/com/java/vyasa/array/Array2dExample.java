package com.java.vyasa.array;

public class Array2dExample {

	public static void main(String[] args) {
		
		//int a[][]=new int[][] {  {4,2,3} ,{1,2,3} ,{1,1,1}, {4,2,3}   };
		
		int a[][]=new int[4][3];
		
		a[0][0]=4;
		a[0][1]=2;
		a[0][2]=3;
		
		a[1][0]=1;
		a[1][1]=2;
		a[1][2]=3;
		
		a[2][0]=1;
		a[2][1]=1;
		a[2][2]=1;
		
		a[3][0]=4;
		a[3][1]=2;
		a[3][2]=3;
	
		
		System.out.println(a.length);
		
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		System.out.println(a[3].length);
		
		System.out.println("*********************************");
		
		for (int i = 0; i <a.length; i++) {
			
			for (int j = 0; j <a[i].length ; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		
	}

}
