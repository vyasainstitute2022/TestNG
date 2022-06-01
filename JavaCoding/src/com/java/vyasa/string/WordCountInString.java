package com.java.vyasa.string;

import java.util.Arrays;

public class WordCountInString {

	public static void main(String[] args) {

		/*
		1.trim the string
		2.convert string to String Array by splitting the string at whitespace
		3.the length of string array is the no of words in the given string
		*/
		
		String str=" Vyasa Testing Manual Automation ";
		String strTrimed=str.trim();
		String words[]=strTrimed.split(" ");
		
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		
	}

}
