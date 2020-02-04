package com.bridgelabz.JUnitClass;



import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter day");
		int d=Utility.readInt();
		System.out.println("enter month");
		int m=Utility.readInt();
		System.out.println("enter year");
		int y=Utility.readInt();
		
		 int day=Utility.findDayOfTheWeek( m, y);
		 System.out.println("Day="+day);
		 
	}

}
