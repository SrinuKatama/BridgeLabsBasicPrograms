package com.bridgelabz.Datastructures;

import java.util.Scanner;

import com.bridgelabz.utility.DatastructuresUtility;

public class Prime2D {

	public static void main(String[] args)
	{
		DatastructuresUtility ds=new DatastructuresUtility ();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int m=sc.nextInt();
		System.out.println("enter the no of coloumns");
		int n=sc.nextInt();
		int i=0,k=1;
		int ar1[]=new int[m*n];
		int ar2[][]=new int [m][n];
		// creating 1D array
		while(i<m*n)
		{
			if(ds.isPrime(k))
			{
				ar1[i]=k;
				i++;
			}
			k++;
		}
		
		// putting the values into 2D array
		int x=0;
			for( i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					ar2[i][j]=ar1[x];
					x++;
				}
			}
			
			//Printing the array
			
			for(i=0;i<m;i++)
			{
				for (int j=0;j<n;j++)
				{
					System.out.print(ar2[i][j]+" ");
				}
				System.out.println();
			}

	}

}
