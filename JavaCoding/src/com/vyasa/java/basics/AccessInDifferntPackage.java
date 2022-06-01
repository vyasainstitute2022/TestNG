package com.vyasa.java.basics;

import com.vyasa.java.oops.AccessModifiers;

import  com.vyasa.java.operators.ClassExample;

public class AccessInDifferntPackage {

	public static void main(String[] args) {

		AccessModifiers am3=new AccessModifiers();
		//am3.x; default ...within package
		am3.y=10000;
		//am3.z; private within class
		
		//am3.displayX();  within class
		am3.displayY(); // public
		//am3.displayZ(); default
		
		ClassExample onj=new ClassExample();
		onj.add();
	}
}
