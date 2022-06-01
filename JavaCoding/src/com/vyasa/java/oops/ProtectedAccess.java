package com.vyasa.java.oops;

public class ProtectedAccess {
	
	protected int x=30;
	
	protected  void dispaly(){
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		ProtectedAccess obj=new ProtectedAccess();
		obj.dispaly();
		obj.x=50;//protected in same class
	}

}
