package com.bridgelabz.Datastructures;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Calender {

	
	public static void main(String[] args)
	{
		
	  Utility u=new Utility();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the month");
	  int month  =sc.nextInt();
	  System.out.println("enter the year");
	  int year=sc.nextInt();
	  u.calender(month, year);
	}
	     
	
}
