package com.bridgelabz.stock;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class StockPortfolio
{
	@SuppressWarnings("unchecked")
	public static void addShares() throws IOException, ParseException
	{
		Stockgetterssetters st=new Stockgetterssetters();
		 FileReader fr=new FileReader("/home/admin1/Desktop/Stock.json"); JSONParser
		 parser=new JSONParser();
		 Object obj=parser.parse(fr);
		JSONArray arr= (JSONArray)obj;
		System.out.println("enter the no. of types of shares:");
		int n=Utility.readInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the share name: ");
			String name=Utility.bufferScanner();
			st.setSharename(name);
			System.out.println("enter the no.of shares:");
			int noofshares=Utility.readInt();
			st.setNoofshares(noofshares);
			System.out.println("enter the share value:");
			float sharevalue=Utility.readlong();
			st.setSharevalue(sharevalue);

			JSONObject object=new JSONObject();
			object.put("sharename",st.getSharename());
			object.put("sharevalue", st.getSharevalue());
			object.put("noofshares", st.getNoofshares());
			arr.add(object);
		}
		System.out.println(arr.toJSONString());
		PrintWriter pw=new PrintWriter("//home/admin1/Desktop/Stock.json");
		pw.write(arr.toJSONString());
		pw.flush();
		pw.close();
		
	}
	public static JSONArray readfile() throws IOException, ParseException
	{
		JSONArray arr=null;
		try {
			FileReader fr=new FileReader("//home/admin1/Desktop/Stock.json");
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
	public static   double stackReport() throws IOException, ParseException
	{    double total=0;
		JSONArray array= StockPortfolio.readfile();
		System.out.println(array);
		System.out.println("enter the stock name to know the report: ");
		String name=Utility.bufferScanner();
		for(int i=0;i<array.size();i++)
		{
			 JSONObject obj=(JSONObject)array.get(i);
			 String sharename=(String)obj.get("sharename");
			 if(name.equalsIgnoreCase(sharename))
			 {
				double  sharevalue= (double)obj.get("sharevalue");
				//System.out.println(sharevalue);
				long noofshares=(long) obj.get("noofshares");
				total=noofshares*sharevalue;
				
			 }
		}
		return total;
		
		
	}

}
