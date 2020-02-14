package com.bridgelabz.creational.prototype.shallowcloning;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable
{ 
	private String shopname;
	List<Book> books=new ArrayList();
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadData()
	{
		for(int i=0;i<10;i++)
		{
		   Book b=new Book();
		   b.setBid(i);
		   b.setBname("book"+i);
		   getBooks().add(b);
		}
		
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", books=" + books + "]";
	}

}
