package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args)
	{
		System.out.println("enter string 1:");
		String s1=Utility.readString();
		System.out.println("enter string 2");
		String s2=Utility.readString();
		boolean ana=Utility.isAnagram1(s1,s2);
		
		if(ana)
		{
			System.out.println("Strings are anagrams");
		}
		else
		{
			System.out.println("Strings are not anagrams");
		}
		
	
		
		

	}

}
