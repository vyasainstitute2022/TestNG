package com.java.vyasa.string;

public class StringMethods {

	public static void main(String[] args) {
		String s=new String("Vyasa ");
		System.out.println(s.trim());
		System.out.println(s);
		System.out.println(s.concat("Testing"));
		System.out.println(s.charAt(3)); 
		System.out.println(s.indexOf('a'));
		System.out.println(s.startsWith("V"));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.substring(2));
		System.out.println(s.replaceAll("a", "I"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s.length());
		}
}
