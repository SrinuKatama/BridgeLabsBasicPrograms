package com.bridgelabz.runnable;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.services.AddressbookServices;

public class AddressBookMain {

	public static void main(String[] args) throws IOException, ParseException
	{
			AddressbookServices as=new AddressbookServices ();
			 //as.addNewPersontoExistingbook();
			//System.out.println("enter delete contact first name:");
			//String first_name=Utility.bufferScanner();
			//as.deleteContact(first_name);
			//as.update(first_name);
			boolean traverse=true;
			System.out.println("........Welcometo My addressbook...........");
			System.out.println("1: add newcontact to existing addressbook");
			System.out.println("2: delete contact to existing addressbook");
			System.out.println("3: Update contact , 4: exit");
			
			
			while(traverse==true)
			{
				System.out.println("enter the choice");
				int choice=Utility.readInt();
				switch(choice)
				{
				  case 1:as.addNewPersontoExistingbook();
				         System.out.println("added sucsessfully");
				         break;
				  case 2:System.out.println("plz enter firstname of the contact which do you want to delete:");
				         String first_name=Utility.bufferScanner();
					     as.deleteContact(first_name);
					     break;
				  case 3:System.out.println("plz enter firstname of the contact which do you want to update:");
			             String first_name1=Utility.bufferScanner();
					     as.update(first_name1);
					     System.out.println("Updated successfully");
					     break;
				  case 4:traverse=false;
				         System.out.println("good by!");
				         break;
				  default:System.out.println("plz enter correct choice");
				}
			}
			
			
			
				

	}

}
