package com.vyasa.java.part4;

import java.sql.SQLException;

public class ThrowsExample {

	void m1() throws InterruptedException
	{
		Thread.sleep(1000);
	}

	void m2() throws InterruptedException,SQLException
	{
		m1();
	}

	public static void main(String[] args) throws Exception{
		ThrowsExample obj=new ThrowsExample();
		obj.m1();
		obj.m2();
	}
}
