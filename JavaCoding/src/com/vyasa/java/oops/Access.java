package com.vyasa.java.oops;

 class Access {

	
	public static void main(String[] args) {

		AccessModifiers  am2=new AccessModifiers();
		am2.x=1000;
		am2.y=2000;
	//	am2.z=400;	  private
		
		//am2.displayX();   private
		am2.displayY();
		am2.displayZ();
	}
}
