package com.vyasa.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(23);
		ts.add(28);
		ts.add(9);
		ts.add(12);
		ts.add(24);
		ts.add(23);
		ts.add(9);
		System.out.println(ts);
		System.out.println("**********************");
		System.out.println(ts.ceiling(23));
		System.out.println(ts.floor(11));
		System.out.println(ts.higher(23));
		System.out.println(ts.lower(24));
		ts.remove(12);
		System.out.println(ts);
		System.out.println("@@@@@@@@@@@@@@@@@");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		HashSet hs=new HashSet();
		hs.add(11);
		hs.add(78);
		hs.add("hi");
		hs.add('A');
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
	}

}
