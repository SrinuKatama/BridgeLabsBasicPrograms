package com.bridgelabz.creational.factorydesign;

public class Factorydetails 
{
	public static PC getComputer(String type,String RAM,String HDD,String CPU)
	{
		if(type.equalsIgnoreCase("PC"))
		{
			return new PC();
		}
	}

}
