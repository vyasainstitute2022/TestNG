package com.vyasa.java.oops;

 class Sample {

	 protected class SubSample{  
		//inner class
		}
	
	int x=20;
	static int y=200;
		
	void displayX()
	{
		System.out.println(x);
		displayY();
	}
	static void displayY()
	{
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
			// static ===>static    nameof class
		    //static ====>nonstatic    object
		
		Sample.displayY();
		Sample obj=new Sample();
		obj.displayX();
		
	}

}
