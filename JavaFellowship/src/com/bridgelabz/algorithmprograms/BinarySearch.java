package com.bridgelabz.algorithmprograms;



import com.bridgelabz.utility.Utility;

public class BinarySearch
  {

	public static void main(String[] args)
	{
		System.out.println("enter array size");
		int n=Utility.readInt();
		String arr[]=new String[n+1];
		
		System.out.println("enter the strings");
		for(int i=0;i<=n;i++)
		{
		   arr[i]=Utility.readString();
		}
		System.out.println("enter the word to search");
		String x=Utility.readString();
		
		int result = Utility.binary(arr, x); 
		  
	    if (result == -1) 
	        System.out.println("Element not present"); 
	    else
	        System.out.println("Element found at "
	                          + "index " + result); 
		}

}
