package com.bridzelabz.commercial;



public interface Services 
{
	public double valueOf();
	public boolean buy(int amount,String symbol,String name);
	public void sell(int amount,String symbol,String name);
	public void addCustomer();
	public void addShares();

}
