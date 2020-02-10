package com.bridgelabz.JsonInventry;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;

public class Services 
{
	
	
	@SuppressWarnings("unchecked")
	public static void addItems() throws IOException, ParseException
	{
		Model ob=new Model();
		FileReader fr=new FileReader("/home/admin1/Desktop/JSON.json");
		JSONParser pars=new JSONParser();
		Object obj=pars.parse(fr);
		JSONArray arr=(JSONArray) obj;
		System.out.println("enter the no. of items:");
		int n=Utility.readInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the name");
			String name=Utility.bufferScanner();
			ob.setName(name);
			System.out.println("enter the weight");
			float weight=Utility.readlong();
			ob.setWeight(weight);
			System.out.println("enter the prize");
			float prize=Utility.readlong();
			ob.setPrize(prize);
			
			JSONObject object=new JSONObject();
			object.put("name", ob.getName());
			object.put("weight", ob.getWeight());
			object.put("prize", ob.getPrize());
			arr.add(object);
		}
		System.out.println(arr.toJSONString());
		PrintWriter pw=new PrintWriter("/home/admin1/Desktop/JSON.json");
		pw.write(arr.toJSONString());
		pw.flush();
		pw.close();
	}
	
	static JSONArray readfile() 
	{
		JSONArray arr=null;
		try {
			FileReader fr=new FileReader("/home/admin1/Desktop/JSON.json");
			JSONParser pars=new JSONParser();
			Object obj=pars.parse(fr);
			arr=(JSONArray)obj;
		    //System.out.println(arr);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return arr;
	}
	public static void removeItems() throws IOException
	{
		System.out.println("enter the item to be deleted");
		String remove=Utility.bufferScanner();
		JSONArray array=readfile();
		System.out.println(array);
		JSONObject ob=new JSONObject();
		
		for(int i=0;i<array.size();i++)
		{
			JSONObject obj=(JSONObject)array.get(i);
			String name=(String)obj.get("name");
			
			if(remove.equalsIgnoreCase(name))
			{
				System.out.println("in");
				array.remove(i);
				FileWriter fw=new FileWriter("/home/admin1/Desktop/JSON.json");
				fw.write(array.toString());
				fw.flush();
				fw.close();
			}
			
		}
	}
	public static double totalWeight()
	{
		double total=0;
		JSONArray array=readfile();
		for(int i=0;i<array.size();i++)
		{
			JSONObject obj=(JSONObject)array.get(i);
			double weight=(double)obj.get("weight");
			total=total+weight;
		}
		return total;
		
	}
	public static double totalprize()
	{
		double total=0;
		JSONArray array=readfile();
		for(int i=0;i<array.size();i++)
		{
			JSONObject obj=(JSONObject)array.get(i);
			double prize=(double)obj.get("prize");
			total=total+prize;
		}
		return total;
	}
	@SuppressWarnings("unchecked")
	public static void show()
	{
		JSONArray array=readfile();
		array.forEach(emp ->display((JSONObject)emp));
	}
	public static void display(JSONObject emp)
	{
		
		String name=(String)emp.get("name");
		String weight=String.valueOf(emp.get("weight"));
		String prize=String.valueOf(emp.get("prize"));
		System.out.println("name:"+name+"\nweight:"+weight+"\nprize:"+prize);
		
		
	}
	

}
