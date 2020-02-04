package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class PalindromePrime {

	public static void main(String[] args) 
	{
		for(int i=100;i<=200;i++)
		{
			if(Utility.isPrime(i))
			{
				if(Utility.isPalindrome(i))
				{
					System.out.println("Prime Palidrome number is :"+i);
				}
			}
		}
		System.out.println("No Prime palindrome no's are present after");
	
	}

}
