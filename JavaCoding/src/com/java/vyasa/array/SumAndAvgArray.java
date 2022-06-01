package com.java.vyasa.array;

import java.util.Arrays;

public class SumAndAvgArray {

	public static void main(String[] args) {
		int sum=0;
		double avg;
	int numbers[]=new int[] {2,7,10,6,4,1};
	
	
	   Arrays.sort(numbers);
	   for (int i = 0; i < numbers.length; i++) {
		  System.out.println(numbers[i]);
	}
	   
	/*System.out.println(numbers.length);
	
		for (int i = 0; i < numbers.length; i++) {
			   sum=sum+numbers[i];
		}
	   		
		System.out.println("sum of array elements is:"+sum);
		avg=sum/numbers.length;
		System.out.println("avg of array elements is :"+ avg);
		*/
	}
}

/*i=0

sum=0
sum=0+2=2
sum=2

i=1

sum=2
sum=2+number[i]
sum=2+7=9
sum =9

i=2
sum=9
sum=9+number[i]
sum=9+10;
sum=19

i=3
sum=19
sum=19+number[i]
sum=19+number[3];
sum=19+6;
sum=25;

i=4
sum=25
sum=25+number[i]
sum=25+number[4]
sum=25+4
sum=29

i=5
sum=29
sum=29+number[i]
sum=29+1
sum=30


*/