package com.bridgelabz.JsonInventry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
	public static void addItems(File f) throws IOException
	{
		Model ob=setObj();
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
			array.add(object);
		}
		System.out.println(array.toJSONString());
		PrintWriter pw=new PrintWriter("/home/admin1/Desktop/JSON.json");
		pw.write(array.toJSONString());
		pw.flush();
		pw.close();
	}
	public void createFile(String file) throws IOException
	{
		File f=new File(file);
		FileWriter fw=new FileWriter(f);
		fw.write("[]");
		fw.flush();
		fw.close();
		
	}

}
