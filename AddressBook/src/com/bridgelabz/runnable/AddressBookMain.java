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
		String first_name=Utility.bufferScanner();
		//as.deleteContact(first_name);
		as.update(first_name);

	}

}
