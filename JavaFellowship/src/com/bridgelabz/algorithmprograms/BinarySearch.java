package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearch
  {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of the array");
		
		int n=sc.nextInt();
		System.out.println("enter the array elements");
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("plz enter key element");
		int key=sc.nextInt();
		
		Utility u=new Utility();
		int k=u.binary(key,ar);
		
		if(k>0)
		{
			System.out.println("key element present");
		}
		else
		{
			System.out.println("key element not present");
		}

	}

}
