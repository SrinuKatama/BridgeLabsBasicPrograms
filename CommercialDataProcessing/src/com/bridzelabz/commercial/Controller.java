package com.bridzelabz.commercial;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridzelabz.util.Utility;

public class Controller 
{ 
	LinkedList list1=new LinkedList();
	static JSONArray readfile() 
	{
		JSONArray arr=null;
		try {
			FileReader fr=new FileReader("/home/admin1/srinu/CommercialData.json");
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

	@SuppressWarnings("unchecked")
	public void addCustomer() throws IOException, ParseException 
	{
		Customer c=new Customer();
		FileReader fr=new FileReader("/home/admin1/srinu/CommercialData.json");
		JSONParser pars=new JSONParser();
		Object obj=pars.parse(fr);
        JSONArray arr=new JSONArray();
		System.out.println("enter the no. of customers:");
		int n=Utility.readInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the customer name: ");
			String custname=Utility.bufferScanner();
			c.setCustname(custname);
			System.out.println("enter the customer balance");
			double custbal=Utility.readdouble();
			c.setCustbal(custbal);
			System.out.println("enter no.of shares");
			int noofshares=Utility.readInt();
			c.setNoofshares(noofshares);
			
			JSONObject object=new JSONObject();
			object.put("custname",c.getCustname());
			object.put("custbal", c.getCustbal());
			arr.add(object);
			list1.add(object);
		}
		System.out.println(arr.toJSONString());
		System.out.println("LinkedList has :"+list1.show());
		PrintWriter pw=new PrintWriter("/home/admin1/srinu/CommercialData.json");
		pw.write(arr.toJSONString());
		pw.flush();
		pw.close();
		
		
	}
   @SuppressWarnings("unchecked")
public void addShares() throws IOException, ParseException 
   {
	     Company cp=new Company();
	   FileReader fr=new FileReader("/home/admin1/srinu/company.json");
		JSONParser pars=new JSONParser();
		Object obj=pars.parse(fr);
		JSONArray arr=new JSONArray();
		System.out.println("enter the no. of companysymbols:");
		int n=Utility.readInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the company symbol name:");
			String symbol=Utility.bufferScanner();
			cp.setsymbol(symbol);
			System.out.println("enter no.of company shares:");
			int numofshres=Utility.readInt();
			cp.setPrice(numofshres);
			System.out.println("enter the share value:");
			int price=Utility.readInt();
			cp.setPrice(price);
			
			JSONObject object=new JSONObject();
			object.put("symbol", cp.getsymbol());
			object.put("numofshres", cp.getNumofshres());
			object.put(" price",cp.getPrice());
			arr.add(object);
		}
		System.out.println(arr.toJSONString());
		PrintWriter pw=new PrintWriter("/home/admin1/srinu/company.json");
		pw.write(arr.toJSONString());
		pw.flush();
		pw.close();
		
		
	}
	public double valueOf() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean buy(int amount, String symbol) throws IOException, ParseException
	{
		  
		  
          
			
			
		
			FileReader fr2=new FileReader("/home/admin1/srinu/company.json");
			
			//JSONObject object1=new JSONObject();
			//JSONObject object2=new JSONObject();
			JSONArray array=readfile();
			for(int i=0;i<array.size();i++)
			{
				JSONObject obj=(JSONObject)array.get(i);
				String prize=(String)obj.get("symbol");
				if(symbol.equalsIgnoreCase(prize))
				{
				int numofshres	=(int)obj.get("numofshres");
				int price =(int)obj.get("price");
				int total=amount/price;
				numofshres=total;
				
				}
			}
			System.out.println(array.toJSONString());
			PrintWriter pw=new PrintWriter("/home/admin1/srinu/company.json");
			pw.write(array.toJSONString());
			pw.flush();
			pw.close();
		return false;
	}
	

	public void sell(int amount, String symbol) throws FileNotFoundException
	{
		
		System.out.println("How many shares do you want to sell:");
		int sell=Utility.readInt();
		FileReader fr1=new FileReader("/home/admin1/srinu/company.json");
		JSONArray array=readfile();
		for(int i=0;i<array.size();i++)
		{
	     	JSONObject obj=(JSONObject)array.get(i);
	     	String symbol1	=(String)obj.get("symbol");
	     	if(symbol.equalsIgnoreCase(symbol1))
	     	{
			int numofshres	=(int)obj.get("numofshres");
			int price	=(int)obj.get("price");
			int total=price*sell;
			numofshres=numofshres-sell;
		     int  amount1=amount+total;
		     System.out.println("total remaining amount is:"+amount1);
	     	}

		}
		System.out.println(array.toJSONString());
		PrintWriter pw=new PrintWriter("/home/admin1/srinu/company.json");
		pw.write(array.toJSONString());
		pw.flush();
		pw.close();

		
	}
	
	

}
