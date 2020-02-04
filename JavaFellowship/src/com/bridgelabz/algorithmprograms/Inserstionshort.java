package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class Inserstionshort {

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
		   
		    int ar1[] =Utility.insertion(ar,n);
		    System.out.println("After searching :");
		     for(int k=0;k<=n-1;k++)
		     {
		    	System.out.print(ar1[k]+" ");
		     }  

	}

}
