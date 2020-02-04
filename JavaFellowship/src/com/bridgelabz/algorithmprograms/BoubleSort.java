package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BoubleSort {

	public static void main(String[] args)
	{
		   System.out.println("plz enter size of an array");
		     int n=Utility.readInt();
		     int ar[]=new int [n];
		     System.out.println("plz enter array elements");
		     for(int i=0;i<n;i++)
		     {
		    	 ar[i]=Utility.readInt();
		     }
		       int ar1[] =Utility.bubble(ar,n);
		        
		        System.out.println("After sorting :");

		     	for(int i1=0;i1<ar.length;i1++)
		     	{
		     		System.out.println(ar[i1]+" ");
		     		
		     	}

	}

}
