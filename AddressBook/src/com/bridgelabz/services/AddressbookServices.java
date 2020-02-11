package com.bridgelabz.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.model.GettersandSetters;

public class AddressbookServices 
{
	JSONArray array=new JSONArray();
	
	private static GettersandSetters gs;
	public static GettersandSetters setObj()
	{
		gs=new GettersandSetters();
		return gs;	
	}
	
	
	@SuppressWarnings("unchecked")
	public void  addNewPersontoExistingbook() throws IOException, ParseException
	{
		

		GettersandSetters gs=setObj();
		System.out.println("enter the first name of the contact  : ");
		String s=Utility.bufferScanner();
		
		 boolean b=AddressbookServices.check(s);
		 if(b==true)
		 {
		 System.out.println("this contact already exist"); 
		 }
		 else 
		 {
			 File f=new File("/home/admin1/srinu/AddressBook.json");
			 if(f.length()!=0)
				 
			 {
			 FileReader fr=new FileReader(f); 
		    JSONParser parser=new JSONParser();
		 
		    Object obj=parser.parse(fr);
	     	 JSONArray array= (JSONArray)obj;
			 
			gs.setFirstname(s);
			System.out.println("enter last name :");
			String lastname=Utility.bufferScanner();
			gs.setLastname(lastname);
			System.out.println("enter phonenumber:");
			long phoneno=Utility.readlong();
			gs.setPhoneno(phoneno);
			System.out.println("enter city:");
			String city=Utility.bufferScanner();
			gs.setCity(city);
			System.out.println("enter state:");
			String state=Utility.bufferScanner();
			gs.setState(state);
			System.out.println("enter address:");
			String address=Utility.bufferScanner();
			gs.setAddress(address);
			
			JSONObject ob=new JSONObject();
			ob.put("firstname",gs.getFirstname());
			ob.put("lastname",lastname);
			ob.put("phoneno",phoneno);
			ob.put("city",city );
			ob.put("state",state);
			ob.put("address",address );
			array.add(ob);
			System.out.println(array.toJSONString());
			PrintWriter pw=new PrintWriter("/home/admin1/srinu/AddressBook.json");
			pw.write(array.toJSONString());
			pw.flush();
			pw.close();
			 }
			 else
			 {
				 gs.setFirstname(s);
					System.out.println("enter last name :");
					String lastname=Utility.bufferScanner();
					gs.setLastname(lastname);
					System.out.println("enter phonenumber:");
					long phoneno=Utility.readlong();
					gs.setPhoneno(phoneno);
					System.out.println("enter city:");
					String city=Utility.bufferScanner();
					gs.setCity(city);
					System.out.println("enter state:");
					String state=Utility.bufferScanner();
					gs.setState(state);
					System.out.println("enter address:");
					String address=Utility.bufferScanner();
					gs.setAddress(address);
					
					JSONObject ob=new JSONObject();
					ob.put("firstname",gs.getFirstname());
					ob.put("lastname",lastname);
					ob.put("phoneno",phoneno);
					ob.put("city",city );
					ob.put("state",state);
					ob.put("address",address );
					array.add(ob);
					System.out.println(array.toJSONString());
					PrintWriter pw=new PrintWriter("/home/admin1/srinu/AddressBook.json");
					pw.write(array.toJSONString());
					pw.flush();
					pw.close();
				 
			 }

		}
		
	}
	public void deleteContact(String first_name) throws IOException, ParseException
	{
//		JSONArray array=null;
//		FileReader fr=new FileReader("/home/admin1/srinu/AddressBook.json");
//		JSONParser parser=new JSONParser();
//		
//		Object obj=parser.parse(fr).toString();
//		array=(JSONArray)obj;
		JSONArray array=readfile1();
		for(int i=0;i<array.size();i++)
		{
		  JSONObject ob= (JSONObject)array.get(i);
		  String fname=  ob.get("firstname").toString();
		  
		  
		  if(first_name.equalsIgnoreCase(fname))
		  {
			  array.remove(i);
			  System.out.println("Deleted contact is:"+fname);
			  
		  }
		}
		System.out.println(array.toJSONString());
		PrintWriter pw=new PrintWriter("/home/admin1/srinu/AddressBook.json");
		pw.write(array.toJSONString());
		pw.flush();
		pw.close();
		
		
	}
	@SuppressWarnings("unchecked")
	public void update(String first_name) throws IOException, ParseException
	{
		JSONArray array=readfile1();
		for(int i=0;i<array.size();i++)
		{
		 JSONObject ob=	(JSONObject)array.get(i);
		 
		 String fname=ob.get("firstname").toString();
		 if(first_name.equalsIgnoreCase(fname))
		 {
			    System.out.println("enter the firstname:");
			    String fname1=Utility.bufferScanner();
			     ob.put("firstname",fname );
			 
			    System.out.println("enter last name :");
				String lastname=Utility.bufferScanner();
				ob.put("lastname",lastname );
				
				
				System.out.println("enter phonenumber:");
				long phoneno=Utility.readlong();
				ob.put("phoneno",phoneno );
				
				System.out.println("enter city:");
				String city=Utility.bufferScanner();
				ob.put("city",city );
				
				System.out.println("enter state:");
				String state=Utility.bufferScanner();
				ob.put("state", state);
				
				System.out.println("enter address:");
				String address=Utility.bufferScanner();
				ob.put("address", address);
				
//				JSONObject ob1=new JSONObject();
//				ob1.put("firstname",gs.getFirstname());
//				ob1.put("lastname",lastname);
//				ob1.put("phoneno",phoneno);
//				ob1.put("city",city );
//				ob1.put("state",state);
//				ob1.put("address",address );
//				array.add(ob1);
				System.out.println(array.toJSONString());
				PrintWriter pw=new PrintWriter("/home/admin1/srinu/AddressBook.json");
				pw.write(array.toJSONString());
				pw.flush();
				pw.close();
		 }
		}

		
	}
	public static boolean check(String first_name) throws IOException, ParseException
	{
		boolean flag=true;
		JSONArray array=readfile();
		
		if(array!=null)
		{
			for(int i=0;i<array.size();i++)
			{
				JSONObject object=(JSONObject)array.get(i);
				 
				if(first_name.equalsIgnoreCase(object.get("firstname").toString()))
				{
					flag= true;
					break;
					
				}
				else
				{
					flag=false;
				}
			}
		}
		else
			flag=false;
		return flag;
		
	}
	public static JSONArray readfile() 
	{
		JSONArray arr=null;
		File f=new File("/home/admin1/srinu/AddressBook.json");
		if(f.length()!=0)
		{
			try {
				FileReader fr=new FileReader("/home/admin1/srinu/AddressBook.json");
				JSONParser pars=new JSONParser();
				Object obj=pars.parse(fr);
				arr=(JSONArray)obj;
	    		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
			System.out.println("file is empty");
		return arr;
	}
	
	public static JSONArray readfile1() throws IOException, ParseException
	{
		JSONArray arr=null;
		try {
			FileReader fr=new FileReader("/home/admin1/srinu/AddressBook.json");
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
	

}

