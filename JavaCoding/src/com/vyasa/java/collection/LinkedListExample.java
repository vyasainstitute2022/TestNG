package com.vyasa.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		
		LinkedList ll=new LinkedList();
		
		ll.add(10);
		ll.add(20);
		ll.addFirst(30);
		ll.addLast(39);
		System.out.println(ll);
		ll.removeFirst();
		ll.add(1, 22);
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll.peekFirst());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		ll.add(2, "ok");
		ll.add(1, 'A');
		System.out.println(ll);

		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//LinkedLIstIterator   
		
	}

}
