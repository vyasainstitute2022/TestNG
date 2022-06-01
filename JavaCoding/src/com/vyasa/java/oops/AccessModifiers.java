package com.vyasa.java.oops;

 public class AccessModifiers {

	 int x=20;    //default
	 public int y=30; 
	 private int z=40;
	 
	 public AccessModifiers(){
		 x=10;
		 y=20;
		 z=30;
	 }
	 
	  
	 private void displayX()
	 {
		 System.out.println(x);
	 }
	 
	 public void displayY()
	 {
		 System.out.println(y);
	 }
	
	  void displayZ()
	 {
		  System.out.println(z);
	 }
	 
	public static void main(String[] args) {
		AccessModifiers am=new AccessModifiers();
		am.displayX();
		am.displayY();
		am.displayZ();
		am.x=100;
		am.y=200;
		am.z=300;
		am.displayX();
		am.displayY();
		am.displayZ();
		
		EncapsulationExample obj=new EncapsulationExample();
		//obj.age=900;
		//obj.setAge(20);
		//obj.displayAge();
		int x=obj.getAge();
		System.out.println(x);
		
	}
}
