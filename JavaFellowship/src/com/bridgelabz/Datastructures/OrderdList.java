package com.bridgelabz.Datastructures;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.DatastructuresUtility;

public class OrderdList {

	@SuppressWarnings("unchecked")
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
		int integerArr[]=new int[strArray.length];
		for(int i=0;i<strArray.length;i++)
		{
			integerArr[i]=Integer.parseInt(strArray[i]);
			list.add(integerArr);
		}
		
		int size=integerArr.length;
		System.out.println(list.show());
		System.out.println("\nsorting");
		list.sort(size);
		System.out.println(list.show());
		System.out.println("enter the key to search in list:");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		
        size = list.searchNode(key, size);
		
		
		
		sc.close();
		
		System.out.println("\nSorting");
		list.sort(size);

		System.out.println(list.show());
		String str = list.returnListInString();
		try {
			u.writeFile(
					"/home/admin1/Desktop/sri.txt",
					str);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
