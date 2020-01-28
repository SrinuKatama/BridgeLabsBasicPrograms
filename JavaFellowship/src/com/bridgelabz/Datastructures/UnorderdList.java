package com.bridgelabz.Datastructures;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class UnorderdList 
{

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key string");
		String s=sc.next();
		Utility u= new Utility();
		LinkedList list = new LinkedList();
		
		String[] strArr =null;

		try {
			strArr = (u.readFile("/home/admin1/Desktop/sri.txt").split(","));

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<strArr.length-1;i++)
		{
			if(s!=strArr[i])
			{
				list.removeAt(i);
				System.out.println("removed successfully");
			}
			else 
			{
				list.addAt(i, s);
				System.out.println("added success fully");
			}
		}
		String s2=strArr.toString();
		
	     try {
			u.writeFile("/home/admin1/Desktop/sri.txt",s2);
		} catch (IOException e) {
			
	    e.printStackTrace();
		}	
		
	}
	
}


