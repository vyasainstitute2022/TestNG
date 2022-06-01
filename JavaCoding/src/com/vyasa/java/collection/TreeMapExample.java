package com.vyasa.java.collection;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Integer,String> tm =new TreeMap<>();
		
		tm.put(1, "Mahesh");
		tm.put(3, "Suresh");
		tm.put(7, "Ramesh");
		tm.put(4, "Manish");
		tm.put(6, "Kiran");
		tm.put(7, "ravi");
		tm.put(8, "karan");
		tm.put(9, "vijay");
		
		System.out.println(tm);
		
		
		System.out.println(tm.firstKey());
		System.out.println(tm.floorKey(4));
		System.out.println(tm.lastKey());
		System.out.println(tm.ceilingKey(6));
		System.out.println(tm.lowerKey(4));
		System.out.println(tm.higherKey(1));
		
		tm.remove(4);
		tm.replace(3, "Suresh", "vivek");
		System.out.println(tm);
		
		
		
	}

}
