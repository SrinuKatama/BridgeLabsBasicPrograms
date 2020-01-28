package com.bridgelabz.Datastructures;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args)
	{
	   DeQue dq=new DeQue(10);
	   Scanner sc=new Scanner(System.in);
	   System.out.println("please enter the String: ");
	   String s=sc.next();
	   String reversal="";
	   
	   for(int i=s.length();i>=0;i--)
	   {
		   dq.insertFront(i);
	   }
	   dq.check(reversal);
	   
	   

	}

}
