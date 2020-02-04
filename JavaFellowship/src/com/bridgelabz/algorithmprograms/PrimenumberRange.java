package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class PrimenumberRange {

	public static void main(String[] args)
	{
		System.out.println("plz enter the range: ");
		int n=Utility.readInt();
         
         for(int i=0;i<=n;i++)
         {
            if( Utility.isPrime(i)) 
            {
            	System.out.println(i);
            }
         }
	}

}
