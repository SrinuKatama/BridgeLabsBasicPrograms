package com.bridgelabz.JsonInventry;

import java.io.File;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;

public class Runner
{

	public static void main(String[] args) throws IOException, ParseException 
	{
		 Controller cr=new  Controller ();
		 cr.createFile("/home/admin1/Desktop/JSON.json");
		 System.out.println("enter Inventary no:");
		 String s=Utility.bufferScanner();
		 File f=new File(s);
		 Controller.addItems(f);
		 
	}

}
