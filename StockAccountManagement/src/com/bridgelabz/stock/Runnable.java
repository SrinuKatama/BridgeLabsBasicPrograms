package com.bridgelabz.stock;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class Runnable {

	public static void main(String[] args) throws IOException, ParseException 
	{
		boolean traverse=true;
		System.out.println("1:add shares 2:stock report ");
		while(traverse==true)
		{
			System.out.println("plz enter the choice");
			int choice=Utility.readInt();
			switch(choice)
			{
			case 1:StockPortfolio.addShares();
			       break;
			case 2:double report =StockPortfolio.stackReport();
	         	    System.out.println(report);
			       break;
			
			default:traverse=false;
			        System.out.println("good bye");
			        break;
			}
		
		}

	}

}
