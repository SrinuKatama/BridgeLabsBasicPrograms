package com.bridgelabz.creational.singleton;

public class Staticblockinitialization 
{
	private Staticblockinitialization() {}
	private static Staticblockinitialization ei;
	static
	{
		ei=new Staticblockinitialization();
	}
	
	public static Staticblockinitialization getInstance()
	{
		return ei;
	}

}
