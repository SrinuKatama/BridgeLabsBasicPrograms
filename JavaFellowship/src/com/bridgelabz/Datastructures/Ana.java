package com.bridgelabz.Datastructures;

import com.bridgelabz.utility.DatastructuresUtility;

public class Ana {

	public static void main(String[] args) 
	{
		DatastructuresUtility ds=new DatastructuresUtility ();
		int[][] ar=new int[10][100];
		int k=1;
		
		for(int i=0;i<10; i++)
		{
			for(int j=0;j<100;j++)
				
			{
				ar[i][j]=k;
				k++;
			}
			
		}
		
		for(int i=0;i<ar.length;i++)
		{
			for (int j=0;j<ar[i].length-1;j++)
			{
				if(ds.isPrime(ar[i][j]))
						{
				          if(ds.isPrime(ar[i][j+1]))
				          {
				        	  if(DatastructuresUtility.isAnagram(String.valueOf(ar[i][j]), String.valueOf(ar[i][j+1])))
				        	  {
				        		  System.out.print(ar[i][j]+" ");
				        	  }
				          }
					
						}	
			}
			System.out.println();
			
		}
		
		

	}

}
