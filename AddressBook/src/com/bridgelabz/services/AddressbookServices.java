package com.bridgelabz.services;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.model.GettersandSetters;

public class AddressbookServices 
{
	JSONArray array=new JSONArray();
	String fileName;
	private static GettersandSetters gs;
	public static GettersandSetters setObj()
	{
		gs=new GettersandSetters();
		return gs;	
	}
	
	public void  addNewPersontoExistingbook()
	{
		System.out.println("");
	}
	
	
	public static void check(String first_name) throws IOException, ParseException
	{
		FileReader fr=new FileReader("/home/admin1/srinu/AddressBook.json");
		JSONParser parser=new JSONParser();
		
		}
		
		
	}

}
