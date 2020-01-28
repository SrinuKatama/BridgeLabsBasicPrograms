package com.bridgelabz.Datastructures;

import java.io.*; 


public class LinkedList
{ 
	Node head;
	
	public void add(String data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head== null)
		{
			head=node;
		}
		else
		{
			Node n=head;  //temparary node
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	
	
	public void addAtStart(String data)
	{
	  
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	
	public void addAt(int index,String data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		Node n=head;
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
		node.next=n.next;
		n.next=node;
		}
	}
	
	public void removeAt(int index)
	{
		if(index==0)
	    {
			head=head.next;
	    }
		else
		{
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("deleted item :"+n1.data);
		}
	}
	
	public void show()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
   
    	public int searchNode( String key, int size) 
    	{
    		
			boolean isFound = false;
			int counter = -1;
			Node n = head;
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
				removeAt(counter);
				size--;
			} 
			else if (n.data.equalsIgnoreCase(key))
			{
				System.out.println("key found at last and deleting...");
				counter++;
				removeAt(counter);
				size--;
			} else 
			{
				System.out.println("key not found and inserting...");
				size++;
				removeAt(counter);
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
    	
}
 

