package com.bridgelabz.Datastructures;

import java.util.Scanner;

public class Queue 
{
	int rear=-1;
	int front=0;
	Object ar[]=new Object[100];
	private String counter; 
	 
	void enque(int x)
	{
		if(isFull())
		{
			System.out.println("Insertion not possible");
		}
		else
		{
			ar[rear++]=x;
		}
	}
	void deque()
	{
		if(isEmpty())
		{
			System.out.println("Deletion not possible");
		}
		else
		{
			Object element=ar[front];
			front++;
		}
		
	}
	
	boolean isFull()
	{ 
		return (rear==getSize()) ? true : false; 
		
	}
	
	boolean isEmpty()
	{
		return (front > rear) ? true : false;
	}
	
	    int getSize()
	    {
	    	return ar.length;
	    }
      public int service()
      {
    	   
    	  Scanner sc =new Scanner(System.in);
          int bankbalance=100000;
          System.out.println("enter 1 withdraw,2 for deposit");
          int choice = sc.nextInt();
          switch (choice) {
          
         
          case 1:  System.out.println("enter the withdraw amount");
                   int withdrawammount=sc.nextInt();
                   bankbalance=bankbalance-withdrawammount;
                   System.out.println("Tq for your servises");
                   withdrawammount=0;
                   break;
                   
          case 2:  System.out.println("enter the deposit");
                   int depositamount=sc.nextInt();
                   bankbalance=bankbalance+depositamount;
                   System.out.println("Tq for your   Services");
                   depositamount=0;
                   break;
           
          default: System.out.println("enter valid choice");
          
          }
          return bankbalance;
          
      }
   	
      }
        

