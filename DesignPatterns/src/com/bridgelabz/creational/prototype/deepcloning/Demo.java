package com.bridgelabz.creational.prototype.deepcloning;


public class Demo 
{
	public static void main(String[] args)  throws CloneNotSupportedException 
	{
		BookShop1 bs=new BookShop1();
		
		bs.setShopname("srinu");
		bs.loadData();
		
		BookShop1 bs1=bs.clone();
		bs.getBooks().remove(1);   //after cloning only we have to print
		System.out.println(bs);
		bs1.setShopname("punnu");
		System.out.println(bs1);
		
	}

}
