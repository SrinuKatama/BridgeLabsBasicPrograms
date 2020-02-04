package com.bridgelabz.functionalprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the  X value");
		int x=Utility.readInt();
		System.out.println("Enter the Y value ");
		int y=Utility.readInt();
		double distance=Utility.DistanceOfPoints(x,y);
		System.out.println("Distance between the points is: "+distance);
		

	}

}
