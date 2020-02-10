package com.bridgelabz.JsonInventry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.Utility.Utility;

public class Controller 
{
	static JSONArray array=new JSONArray();
	private static Model obj;
	public  static Model setObj()
	{
		obj=new Model();
		return obj;
	}
	
	@SuppressWarnings("unchecked")
	public static double grandTotal() throws  IOException, ParseException,ClassCastException
	{
		double inv=0;
		
		JSONArray arr=Services.readfile();
		System.out.println(arr);
		System.out.println("enter product name to calulate");
		String cal=Utility.bufferScanner();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject inventory=(JSONObject) arr.get(i);
			String name=inventory.get("name").toString();
			if(cal.equalsIgnoreCase(name))
			{
				System.out.println("name="+name);
				double weight=(double) inventory.get("weight");
				double price=(double) inventory.get("prize");
				inv=weight*price;
			}
		}
		return inv;
	}

	

}
