package com.bridgelabz.functionalprogram;



import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the value of a");
		int a=Utility.readInt();
		System.out.println("Enter the value of b");
		int b=Utility.readInt();
		System.out.println("Enter the Value of c");
		int c=Utility.readInt();
        double ar[]= Utility.Quadratics(a,b,c);
        System.out.println("your Quadratic formula for positive sign is " +ar[0]);
        System.out.println("your Quadratic formula for negative sign is " +ar[1]);
	}

}
