package com.bridgelabz.JsonInventry;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Services 
{
	static JSONArray array=new JSONArray();
	static JSONObject obj;
	
	public static JSONArray readJson() throws FileNotFoundException, ParseException
	{
		
		FileReader fr=new FileReader("/home/admin1/Desktop/JSON.json");
		try {
		
			JSONParser parser=new JSONParser();
			Object ob=parser.parse(fr);
			 array= (JSONArray)ob;
			 System.out.println(array);
			 return array;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		array=new JSONArray();
		return null;
	}

}
