package com.bridgelabz.creational.prototype.shallowcloning;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		BookShop bs=new BookShop ();
		bs.setShopname("srinu");
		bs.loadData();
		bs.getBooks().remove(3);//removing the book
		System.out.println(bs);
		
		BookShop bs1=(BookShop)bs.clone();
		
		System.out.println(bs1);//same remove actoin also reflect here

	}

}
