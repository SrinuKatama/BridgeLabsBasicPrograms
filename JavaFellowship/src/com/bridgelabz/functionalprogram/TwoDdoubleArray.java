package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class TwoDdoubleArray {

	public static void main(String[] args) 
	{

		System.out.println("plz enter no.of rows ");
		int m=Utility.readInt();
		System.out.println("plz enter no.of coloumns");
		int n=Utility.readInt();
		
		System.out.println("please enter  values");

		double[][] ar= Utility.twoDdoubleArray(m,n);
		System.out.println("The two-D Array is: ");
             
            for(int i=0;i<m;i++)
          	{
          	  for(int j=0;j<n;j++)
          		{
          			System.out.print(" "+ar[i][j]);
          		}
          		System.out.println();
          	}

		
	}
}

