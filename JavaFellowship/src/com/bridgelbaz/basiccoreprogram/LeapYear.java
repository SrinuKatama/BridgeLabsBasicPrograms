package com.bridgelbaz.basiccoreprogram;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		   Utility util = new Utility();
		   System.out.println("enter year for leap year check :");
		   int n=Utility.readInt();
		   String s=""+n;
		   
		   if(s.length()==4)
		   {
			  boolean  year= Utility.leapYear(n);
			  if(year)
			  {
				System.out.println("leapyear");  
			  }
			  else 
			  {
				  System.out.println("Non leapyear");
			  }
		   }
		   else
		   {
			   System.out.println("enter 4 digit year");
		   }
	         
		
	}

}
