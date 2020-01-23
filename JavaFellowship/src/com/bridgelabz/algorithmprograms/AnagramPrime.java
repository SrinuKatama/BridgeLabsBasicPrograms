package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class AnagramPrime {

	public static void main(String[] args) 
	{
		for(int i=0;i<=100;i++)
		{
			if(Utility.isPrime(i))
			{
				for(int j=i+1;j<=100;j++)
				{
					if(Utility.isPrime(j))
					{
						if(Utility.isAnagram(String.valueOf(i), String.valueOf(j)))
						{
							System.out.println("prime anagrams are:"+i+","+j);
						}
					}
				}
			}
		}

	}

}
