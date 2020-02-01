package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args)
	{
		int ar[]= {86,25,16,45,90};
		int low=0,high=ar.length-1,mid=(low+high)/2;
		Utility u=new Utility();
		
		u.merge(ar,low,high,mid);
		
		System.out.println("\nSorted array"); 
        u.printArray(ar); 
        
		
	}

	
}
