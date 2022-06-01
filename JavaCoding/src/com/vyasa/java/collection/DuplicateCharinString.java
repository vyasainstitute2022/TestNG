package com.vyasa.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharinString {

	public static void main(String[] args) {

		String strGiven="Java JDk JRE Java";
		String str=strGiven.toLowerCase();
		String[] st=str.split(" ");
		//char[] ch=str.toCharArray();
		
		HashMap<String,Integer> hm=new HashMap<>();
		
		for(String c:st)
		{
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1);
			}else
			{
				hm.put(c, 1);
			}
			
		}
		
		System.out.println(hm);
		
		Set<Map.Entry<String, Integer>> entries=hm.entrySet() ;
		
		for(Map.Entry<String, Integer> entry:entries)
		{
			
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
					
			}
			
		}
		
		
	}

}
