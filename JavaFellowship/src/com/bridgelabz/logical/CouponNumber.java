package com.bridgelabz.logical;



import com.bridgelabz.utility.Utility;

public class CouponNumber 
{
   public static void main(String [] args)
   {
	System.out.println("enter the Size of the array");
	int n=Utility.readInt();
	
	int a[]=new int[n];
    int ar[]= Utility.coupan(a);
    System.out.println(" the coupn numbers are:");
      for(int i=0;i<ar.length;i++) 
   	   {
   		System.out.print(ar[i]+" ");
     	}

   }
}
