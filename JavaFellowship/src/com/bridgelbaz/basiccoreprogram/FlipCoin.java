package com.bridgelbaz.basiccoreprogram;

import com.bridgelabz.utility.Utility;

public class FlipCoin
{
   public static void main(String[] args) 
	 {
	   System.out.println("enter the no. of times to flip the coin :");
	   int n=Utility.readInt();
	   
	    double ar[]=Utility.flip(n);
	    System.out.println("head percentage is :"+ar[0]);
		System.out.println("tail percentage is :"+ar[1]);
      }
}

