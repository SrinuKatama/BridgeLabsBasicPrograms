package com.bridgelabz.Datastructures;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class UnorderdList 
{

	public static void main(String[] args) 
	{
	 
		LinkedList<String> ll=new LinkedList<String> ();
		Utility u=new Utility();
		String[] ar=null;
		try {
			ar=u.readFile("/home/admin1/Desktop/srinivas/").split(" ");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
        int size=ar.length;
		for(int i=0;i<ar.length;i++)
		{
			ll.add(ar[i]);
		}
		System.out.println("Linked List :"+ll);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key to search");
		String key = scanner.next();
		for(int i=0;i<ar.length;i++)
		{
			if(key==ar[i])
			{
				ll.remove(i);
				System.out.println("Removed Successfully");
			}
			else
			{
				ll.add(key);
				System.out.println("Added Successfully");
			}
			
	     	}
		   String s2=ar.toString();
		
		     try {
				u.writeFile("/home/admin1/Desktop/sri.txt",s2);
			} catch (IOException e) {
				
								e.printStackTrace();
			}	

	}

}
