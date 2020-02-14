package com.bridgelabz.creational.prototype.deepcloning;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.creational.prototype.shallowcloning.Book;

public class BookShop1 implements Cloneable
{
	private String shopname;
	@SuppressWarnings("unchecked")
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
	protected BookShop1 clone() throws CloneNotSupportedException {
		BookShop1 shop=new BookShop1();
		for(Book b:this.getBooks())
		{
			shop.getBooks().add(b);
		}
		return shop;
	}
	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", books=" + books + "]";
	}


}
