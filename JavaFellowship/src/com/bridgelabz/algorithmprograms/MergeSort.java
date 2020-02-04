package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args)
	{
		System.out.println("enter the size of an array:");
		int n=Utility.readInt();
	     System.out.println("plz enter array elements");
	     int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			 arr[i]=Utility.readInt();
		}
		
        int l=0,r=arr.length-1;
        int m=r/2;
        System.out.println("given array");
        for (int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
       int[] ar1 =Utility.merge(arr, l, m, r);
        System.out.println( );
        
        //to print an array.
        
         System.out.println("After sorting:");
             
            for (int i=0; i<ar1.length; ++i) 
                System.out.print(arr[i] + " "); 
            System.out.println(); 
        
        
		
	}

	
}
