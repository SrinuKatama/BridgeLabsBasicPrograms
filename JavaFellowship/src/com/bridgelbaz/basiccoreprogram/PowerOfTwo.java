package com.bridgelbaz.basiccoreprogram;



import com.bridgelabz.utility.Utility;

public class PowerOfTwo {

	public static void main(String[] args)
	{
		
		System.out.println("please enter the number");
		int n=Utility.readInt();
		
		
		 int ar[]=Utility.power(n);
		 for(int i=0;i<ar.length;i++)
		 {
		 System.out.println("2 power "+(i+1)+"is :"+ar[i]);
		 }
	

	}

}
