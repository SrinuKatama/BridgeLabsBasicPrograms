package com.bridgelabz.Datastructures;

import java.util.Arrays;

public class DeQue 
{
	 final int max=100;
	int front;
	int rear;
	int size;
	int arr[];
	public DeQue( int size)
	{
		arr=new int[max];
		front=-1;
		rear=0;
		this.size=size;
	}
	
	public  boolean isEmpty()
	{
		return (front == -1);
		
			
		
	}
	public  boolean isFull()
	{
		return((front == 0 && rear==size-1) || front==rear+1);
	}
	 
 	public void insertFront(int key)
	{
		if(isFull())
		{
			System.out.println("overflow");
		}
		if(front == -1)
		{
			front=0;
			rear=0;
		}
		else if(front==0)
		{
			front=size-1;
			
		}
		else
		{
			front=front-1;
			
		}
		arr[front]=key;
		
	}
	public  int insertRearend(int key)
	{
		if(isFull())
		{
			System.out.println("overflow");
		}
		if(front==-1)
		{
			front=0;
			rear=0;
			
		}
		else if(rear==size-1)
		{
			rear=0;
		}
		else
		{
			rear=rear+1;
		}
		return arr[rear]=key;
	}
	
	public void deletefront()
	{
		if(isEmpty())
		{
			System.out.println("under flow");
		}
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(front ==size-1)
		{
			front=0;
		}
		else
		{
			front=front+1;
		}
		
	}
	public void deleterear()
	{
		if(isEmpty())
		{
			System.out.println("under flow");
		}
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(rear==0)
		{
			rear=size-1;
		}
		else
		{
			rear=rear-1;
		}
	}
		
		int getFront() 
	    { 
	        // check whether Deque is empty or not 
	        if (isEmpty()) 
	        { 
	            System.out.println(" Underflow"); 
	            return -1 ; 
	        } 
	        return arr[front]; 
	    } 
		int getRear() 
	    { 
	        // check whether Deque is empty or not 
	        if(isEmpty() || rear < 0) 
	        { 
	            System.out.println(" Underflow\n"); 
	            return -1 ; 
	        } 
	        return arr[rear]; 
	    } 
	    void check(String s)
	    {
	    	String s2=Arrays.toString(arr);
	    	if(s2==s)
	    	{
	    		System.out.println("palindrome");
	    		
	    	}
	    	else
	    	{
	    		System.out.println("non palindrome");
	    	}
	    }
	
	
	
	
	
	
	
	
	

}
