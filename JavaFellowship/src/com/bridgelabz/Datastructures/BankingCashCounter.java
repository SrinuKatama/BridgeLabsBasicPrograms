package com.bridgelabz.Datastructures;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BankingCashCounter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Queue q = new Queue();
	System.out.println("Enter people size");
	int people = sc.nextInt();

	System.out.println("Hi! Welcome to bank simulation: ");
	
	for (int i = 0; i < people; i++) 
	{

		q.enque(i);
		q.service();
		q.deque();
	}
	
	if (q.isEmpty())
	{
		System.out.println("Queue is empty");
	}
	int bal=q.service();
	System.out.println("Bank Closing balance is : " +bal );
	
	
}
}
