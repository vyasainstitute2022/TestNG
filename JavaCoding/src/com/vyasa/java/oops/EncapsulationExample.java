package com.vyasa.java.oops;

public class EncapsulationExample {

	private int age=1;  //making var as private 
	
	private void setAge(int a) //providing setter method for the variables
	{
		if(a>=1)
		{
		age=a;
		}else
		{
			System.out.println("invalid age");
			age=0;
		}
		
	}
	
	public int getAge()
	{
		return age;
	}
	
	void displayAge()
	{
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		EncapsulationExample obj=new EncapsulationExample();
		obj.setAge(20);
		obj.displayAge();
	}

}