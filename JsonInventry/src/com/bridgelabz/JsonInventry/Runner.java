package com.bridgelabz.JsonInventry;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;

public class Runner
{
	public static void main(String[] args) throws IOException, ParseException, ClassCastException, java.text.ParseException
	{
		boolean traverse=true;
		while(traverse=true)
		{
			System.out.println("1:addItems,  2:removeItems,  3:grandTotal,  4:TotalWeight,  5:Totalprize,  6:display, 7:exit");
			System.out.println("please enter the choice");
			int choice=Utility.readInt();
			switch(choice)
			{
			case 1:Services.addItems();
			       break;
			case 2:Services.removeItems();
			       break;
			case 3:double tot=Controller.grandTotal();
			       System.out.println(tot);
			       break;
			case 4: double totalweight=Services.totalWeight();
			        System.out.println(totalweight);
			        break;
			case 5:double totalprize=Services.totalprize();
		           System.out.println(totalprize);
			
			case 6:Services.show();
		           break;
			case 7:traverse=false;
		           System.out.println("bye");
			
			default:System.out.println("enter correct choice");
			        break;
			}
		}
	}
}

