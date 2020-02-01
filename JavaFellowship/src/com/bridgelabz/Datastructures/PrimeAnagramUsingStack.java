package com.bridgelabz.Datastructures;

import com.bridgelabz.utility.DatastructuresUtility;

public class PrimeAnagramUsingStack {

	public static void main(String[] args) 
	{
		
		 DatastructuresUtility ds=new  DatastructuresUtility(); 
		 StackUsingLinkedList st=new  StackUsingLinkedList();
		 int start=0;
		 int end=100;
		 int ar[][]=new int [10][];
		 int j1=0,j2=0;
		 for(int i=0;i<10;i++)
		 {
			 for(int j=start;j<=end;j++)
			 {
				 if(ds.isPrime(j))
				 {
					 for(int k=j+1;k<end;k++)
					 {
						 if(ds.isPrime(k))
						 {
							 if(ds.isAnagram(String.valueOf(j), String.valueOf(k)))
							 {
								 st.push(j);
								 st.push(k);
								 
							 }
						 }
					 }
					 
				 }
			 }
			 
		 }
		 st.show();
		 
		 int tempsize=st.size();
		 for(int i=0;i<tempsize;i++)
		 {
			 System.out.print(st.peek()+" ");
			 if(!st.isEmpty())
			 {
				 st.pop();
			 }
			 
		 }
		 


	}

}
