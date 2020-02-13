package com.bridgelabz.creational.singleton;

public class BillPughSingletonImplementation 
{
	private BillPughSingletonImplementation() {}
	
	private static class BillPughSingleton
	{
	private static  final BillPughSingletonImplementation bps=new BillPughSingletonImplementation();
	}
	
	public static BillPughSingletonImplementation getInstance()
	{
		return BillPughSingleton.bps;
	}
	

}
