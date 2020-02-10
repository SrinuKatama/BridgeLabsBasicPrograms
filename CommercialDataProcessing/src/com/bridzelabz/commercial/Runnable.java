package com.bridzelabz.commercial;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridzelabz.util.Utility;

public class Runnable {

	public static void main(String[] args) throws IOException, ParseException 
	{
		Controller c=new Controller();
		System.out.println(".............Welcome to Commercialdata.........");
		System.out.println("1:Addcustomers  2:Addshares  3:buy  4:sell 5:wxit");
		System.out.println("enter your choice");
		int choice=Utility.readInt();
		boolean traverse=true;
		while(traverse==true)
		{
			switch(choice)
			{
			case 1:c.addCustomer();
			       break;
			case 2:c.addShares();
			       break;
			case 3:System.out.println("enter the amount");
			       int amount=Utility.readInt();
			       System.out.println("enter which symbol shares to buy");
			       String symbol=Utility.bufferScanner();
				   c.buy(amount, symbol);
			case 4:System.out.println();
			      System.out.println("enter the amount");
		          int amount1=Utility.readInt();
		          System.out.println("enter which symbol shares to buy");
		          String symbol1=Utility.bufferScanner();
			      c.sell(amount1, symbol1);
			case 5:traverse =false;
			       System.out.println("by");
			 default:System.out.println("plz enter currect choice ");
			    
			}
		}
		
		
		

	}

}
