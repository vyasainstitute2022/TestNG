package com.vyasa.java.basics;

public class ReturnType {

	int total,sub;//300    //1200    //1300
	public int add(int a,int b)
	{
		total=a+b;
		return total;
	}
	
	public void sub(int a,int b)
	{
		sub=a-b;
	}
	
	
	public void display()
	{
		System.out.println("total addition is:"+total);
		System.out.println("sub is:"+sub);
	}
	
	
	public static void main(String[] args) {
		
		int retrunTotal=0;
		double avg=0;
		
		ReturnType ref=new ReturnType();
		retrunTotal=ref.add(100,200);//actual 
		ref.sub(20,10);
		ref.display();
		
		
		//future use
		avg=retrunTotal/2;
		System.out.println("avg value is:"+avg);
		
		
		/*ReturnType ref2=new ReturnType();
		ref2.add(500,700);
		ref2.display();
		
		ReturnType ref3=new ReturnType();
		ref3.add(900,400);
		ref3.display();
		*/
		
	}

}
