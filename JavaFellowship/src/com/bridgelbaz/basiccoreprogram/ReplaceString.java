package com.bridgelbaz.basiccoreprogram;

import com.bridgelabz.utility.Utility;

public class ReplaceString
{
	public static void main(String[] args)
	{
		System.out.println("enter the String :");
		String s=Utility.readString();
		if(s.length()>3)
		{
		String  t=Utility.replace(s);
		System.out.println(t);
		}
		else {
			System.out.println("enter the String having more than length=2 ");
		}
		
		
		
		
		
		
	}

}
