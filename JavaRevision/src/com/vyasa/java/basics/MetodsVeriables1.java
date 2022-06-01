
package com.vyasa.java.basics;

public class MetodsVeriables1 {
	
		int x=10,y=20, total;
		
		static  MetodsVeriables1 objadd;
		 
		 static void addition()
		  {
			  objadd=new MetodsVeriables1();
			 objadd.total = objadd.x+objadd.y;
			// System.out.println(objadd.total);
		  }
		 
		void display()
		  {
			
			System.out.println("total is :"+total);
		  }
		
		public static void main(String[] args) {
			MetodsVeriables1.addition();
			objadd.display();
		}
	}
