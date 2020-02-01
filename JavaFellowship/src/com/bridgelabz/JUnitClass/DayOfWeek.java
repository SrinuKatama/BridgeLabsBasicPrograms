package com.bridgelabz.JUnitClass;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();

		Utility u =new Utility();
		 int day=Utility.findDayOfTheWeek( m, y);
		 
	}

}
