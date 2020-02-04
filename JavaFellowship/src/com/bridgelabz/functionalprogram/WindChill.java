package com.bridgelabz.functionalprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args)
	{
		
		System.out.println("Enter the Tempertate in Fahrenheit ");
		int t=Utility.readInt();
		System.out.println("Enter the  miles per hour ");
		int v=Utility.readInt();
		if(t<50 && (v<120 && v>3))
		{
			double wind=Utility.Wind(t,v);
			System.out.println("WindChill value is :"+wind);
		}
		else
		{
			System.out.println("enter correct values");
		}
	
		

	}

}
