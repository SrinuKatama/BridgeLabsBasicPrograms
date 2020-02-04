package com.bridgelbaz.basiccoreprogram;



import com.bridgelabz.utility.Utility;

public class FactorsOfTheNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter the factorial number: ");
		int n=Utility.readInt();
		
		int factorial =Utility.factors(n);
		System.out.println("factorial of "+n+"  is :"+factorial);
	}

}
