package com.bridgelabz.Datastructures;

import com.bridgelabz.utility.DatastructuresUtility;

public class PrimeNumber2DArraar {

	public static void main(String[] args)
    {
		DatastructuresUtility ds=new DatastructuresUtility ();


		int start =1;
		int end=100;
		int ar[][]=new int[10][];
		
		for(int i=0;i<10;i++)
		{
			while(end <1001)
			{
			for(int j=start;j<end;j++)
			{
			   if(ds.isPrime(j))
			   {
				ar[i][j]=j;
			   }
			}
			  end=end+100;
			  start=end+1;
		 }
		}
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
