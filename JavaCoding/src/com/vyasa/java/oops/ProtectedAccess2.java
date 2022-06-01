package com.vyasa.java.oops;

public class ProtectedAccess2 {
	
	public static void main(String[] args) {
		
		ProtectedAccess obj=new ProtectedAccess();
		obj.dispaly();
		obj.x=79;  //protected in other class
		obj.dispaly();
	}
}
