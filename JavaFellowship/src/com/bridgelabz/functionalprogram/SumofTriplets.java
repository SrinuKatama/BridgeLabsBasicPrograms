package com.bridgelabz.functionalprogram;



import com.bridgelabz.utility.Utility;


public class SumofTriplets {

	public static void main(String[] args)
	{

		
		System.out.println("please enter size of array");
		int n=Utility.readInt();
		int ar[]=new int[n];
		System.out.println("plz enter the array values :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=Utility.readInt();
		}
		    String ar2=Utility.touple(ar);
		    System.out.println("Triplet elements are :");
		    for(int i=0;i<ar2.length();i++)
		    {
		    	System.out.print(ar2.charAt(i)+" ");
		    }
		
		

	}

}
