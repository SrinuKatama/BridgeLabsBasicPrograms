package com.bridgelabz.Datastructures;

import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.DatastructuresUtility;
import com.bridgelabz.utility.Utility;

public class OrderdList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{

		DatastructuresUtility utility = new DatastructuresUtility();
		LinkedList<String> list = new LinkedList<String>();
		String[] strArr =null;

		try {
			strArr = (utility.readFile("/home/admin1/Desktop/orderlist.txt").split(","));

		} catch (IOException e) {
			e.printStackTrace();
		}
		 Arrays.sort(strArr);
		for (int i = 0; i < strArr.length; i++)
		{
			
			list.add(strArr[i]);
		}
		
		list.show();
		
		System.out.println("\nEnter key to search in list:");
		
		String key = Utility.readString();
		int size=strArr.length;
		list.searchNode(key, size);
		list.show();

		//list.sort(size);

		String str = list.returnListInString();
		try {
			utility.writeFile("/home/admin1/Desktop/orderlist.txt",str);
					
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
