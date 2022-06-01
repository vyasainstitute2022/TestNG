package com.java.vyasa.string;
public class DuplicateWords {
	public static void main(String[] args) {
		int count;
		String str="listen";
		String str2="silent";
		String strTrimed=str.trim();
		String strLower=strTrimed.toLowerCase();
		String words[]=strTrimed.split(" ");
		for (int i = 0; i < words.length; i++) {
			count=1;
			      for (int j =i+1; j < words.length; j++) {
						if(words[i].equals(words[j]))
						{
							count++;
							words[j]="0";
						}
			           }
			      //count=4
				if(count>1 && words[i]!="0")
				{
					System.out.println(count);
					System.out.println(words[i]);
				}
		}
	}
}

