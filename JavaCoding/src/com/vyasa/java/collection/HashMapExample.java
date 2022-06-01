package com.vyasa.java.collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		HashMap hm=new HashMap();
		
		hm.put(1, "ab");
		hm.put(3, null);
		hm.put(4, 23);
		hm.put(5, 23.6);
		hm.put(6, 25);
		hm.put(7, 26);
		hm.put(4, 23);
		hm.put(2, 21);
		System.out.println(hm.put(1, 20));
		System.out.println(hm);
		System.out.println(hm.get(4));
		System.out.println(hm.containsKey(7));
		System.out.println(hm.containsValue(22));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		//hashtable
		
			Hashtable ht=new Hashtable();
		
		ht.put(1, "ab");
		ht.put(3, 2);
		ht.put(4, 'A');
		ht.put(5, 23.6);
		ht.put(6, 25);
		ht.put(7, 26.7);
		ht.put(4, 23);
		ht.put(2, 21);
		ht.put(2, 88);
		System.out.println(ht.put(1, 20));
		System.out.println(ht);
		System.out.println(ht.get(4));
		System.out.println(ht.containsKey(7));
		System.out.println(ht.containsValue(22));
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		
		
	}

}
