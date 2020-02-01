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

		q.enQueue(i);
		q.service();
		q.deQueue();
	}
	
	if (q.isEmpty())
	{
		System.out.println("Queue is empty");
	}
	
	System.out.println("Bank Closing balance is : " +q.bankBalance );
	sc.close();
}
}
