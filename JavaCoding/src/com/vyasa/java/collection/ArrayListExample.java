package com.vyasa.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Object> al=new ArrayList<>();
				
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(70);
		al.add(45);
		al.add(45);
		al.add("Hi");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(23.76);
		
		for(Object o:al) {
			System.out.println(o);
		}
		
		
	
		System.out.println(al);
	
		System.out.println(al.size());
	
		System.out.println("******************************");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		al.remove(3);
		
		System.out.println("******************************");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		al.add(200);
		al.add(900);
		al.add(92);
		al.add(921);
		System.out.println("******************************");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
			
		System.out.println("##########################");
		
		Iterator<Object> itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(al.contains("Hi"));
		System.out.println(al.indexOf("Hi"));
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		ListIterator<Object> listitr=al.listIterator();
		
		while(listitr.hasNext())
		{
			System.out.println(listitr.next());
		}
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		while(listitr.hasPrevious())
		{
			System.out.println(listitr.previous());
		}
		
		
		System.out.println(al);
		
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		
		ArrayList aln=new ArrayList(hs);
		
		System.out.println(aln);
		
		
		
		
		
	}
}
