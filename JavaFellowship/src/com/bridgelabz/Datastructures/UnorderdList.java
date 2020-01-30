package com.bridgelabz.Datastructures;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.DatastructuresUtility;

public class UnorderdList 
{

	public static void main(String[] args) 
	{ 
		
		DatastructuresUtility  u= new DatastructuresUtility ();
		LinkedList list = new LinkedList();
		
		String[] strArray =null;

		try {
			strArray = (u.readFile("/home/admin1/Desktop/sri.txt").split(" "));

		} catch (IOException e) {
			e.printStackTrace();
		}
		int size=strArray.length;
		
		for(int i=0;i<strArray.length;i++)
		{
			
				list.add(strArray[i]);
		}
		System.out.println(list.show());
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key string");
		String key=sc.next();
		size = list.searchNode(key, size);
		System.out.println(list.show());
		
		
	     try {
			u.writeFile("/home/admin1/Desktop/sri.txt",list.returnListInString());
		} catch (IOException e) {
			
	    e.printStackTrace();
		}	
		
	}
	
}


