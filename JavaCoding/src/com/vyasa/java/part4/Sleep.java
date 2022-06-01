package com.vyasa.java.part4;

public class Sleep {
	public static void main(String[] args) {
		
		System.out.println("beofre exception");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}   //checked
		System.out.println("After exception");
	}
}

