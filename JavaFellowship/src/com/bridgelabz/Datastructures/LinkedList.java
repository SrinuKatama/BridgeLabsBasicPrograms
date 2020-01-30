package com.bridgelabz.Datastructures;

import java.io.*;
import java.util.List; 


public class LinkedList<T>
{ 
	Node<T> head;
	
	int size=0;
	
	
	public void add(Object data)
	{
		Node<T> nodenew=new Node();
		nodenew.data= (T)data;
		
		nodenew.next=null;
		if(head== null)
		{
			head=nodenew;
			size++;
		}
		else
		{
			Node<T> n=head;  //temparary node
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=nodenew;
			size++;
		}
	}
	
	
	public void addAtStart(T data)
	{
	  
		Node<T> nodenew=new Node();
		nodenew.data=data;
		nodenew.next=null;
		nodenew.next=head;
		head=nodenew;
		size++;
	}
	
	public void addAt(int index, T data)
	{
		Node<T> nodenew=new Node();
		nodenew.data=data;
		nodenew.next=null;
		
		Node<T> n=head;
		if(index ==0)
		{
			addAtStart(data);
			
		}
		else
		{
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		nodenew.next=n.next;
		n.next=nodenew;
		}
		size++;
	}
	public T get(int index)
	{
		if(index ==0)
		{
			return head.data;
		}
		else
		{
			Node<T> n=head;
			for(int i=0;i<index;i++)
			{
				if(n.next !=null)
				{
					n=n.next;
				}
				else
				{
					return null;
				}
			}
			n=n.next;
			return n.data;
		}
	}
	public void deleteAtStart()
	{
		head=head.next;
		size--;
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
	    {
			head=head.next;
	    }
		else
		{
			Node<T> n=head;
			Node<T> n1=null;
			
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("deleted item :"+n1.data);
			n1=null;
		}
		size--;
	}
	public void deleteEnd()
	{
		if(!isEmpty())
		{
			Node<T> n = head;

			while (n.next != null) {
				n = n.next;
			}

			n.next = null;

		} else {
			System.out.println("Linked list is empty nothing to delete");
		}
		size--;
			
		}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public String show()
	{
		String str="";
		Node<T> n = head;
		if (head == null) {
			return "no data";
		} else {
			while (n.next != null) {
				str += n.data + " ";
				n = n.next;
			}
			str += n.data;
		}

		return str;
		
		
	}
	public String showListWithoutSpaces() {
		String str = "";
		Node<T> n = head;
		while (n.next != null) {
			str += n.data;
			n = n.next;
		}
		str += n.data;
		return str;
	}
   
    	public int searchNode( T key, int size) 
    	{
    		
			boolean isFound = false;
			int counter = -1;
			Node<T> n = head;
			while (n.next != null) {
				counter++;
				if (n.data==key) {
					isFound = true;
					break;
				}
				n = n.next;
			}
			
			if (isFound)
			{
				System.out.println("key found ");
				deleteAt(counter);
				size--;
			} 
			else if (n.data.equals(key))
			{
				System.out.println("key found at last and deleting...");
				counter++;
				deleteAt(counter);
				size--;
			} else 
			{
				System.out.println("key not found and inserting...");
				size++;
				add(key);
			}
			return size;
		}
    	public String returnListInString() 
    	{
			String str = "";
			Node n = head;
			while (n.next != null) {
				str += n.data + ",";
				n = n.next;
			}
			str += n.data;
			return str;
    }
    	public <T extends Comparable<T>> void sort(int size) {
			@SuppressWarnings("unchecked")
			Node<T> n = (Node<T>) head;
			Node<T> n1 = n.next;
			T temp;

			for (int i = 0; i < size - 1; i++) {
				for (int j = 0; j <= size - 1 - i - 1; j++) {

					if (n.data.compareTo(n1.data) > 0) {
						temp = n.data;
						n.data = n1.data;
						n1.data = temp;
					}
					n1 = n1.next;
				}
				n = n.next;
				n1 = n.next;
			}
		}
    	public void addAll(List<T> list)
    	{

			for (int i = 0; i < list.size(); i++) {
				add(list.get(i));
			}

		}
    	
}
 

