package com.sri;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
			 Scanner sc=new Scanner(System.in);
			 int n=sc.nextInt();
			 int ar1[]=new int[n];
			 if(n<=100)
			 {
				 
				 int i=0,j=0,s;
				for( i=2;i<n;i++)
				
				 {
					s=0;
					 for(j=2;j<i;j++)
					 {
						 if(i%j==0)
						 {
							 s=1;
						 }
						 break;
					 }
					 if(s==0)
					 {
						 
						System.out.println(i);
						 ar1[i]=i;
						 
					 }
				 }
			 }
			 else
			 {
				 System.out.println("enter no. between range");
			 }
		
			

	}

}
