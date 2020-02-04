package com.bridgelabz.logical;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) 
	{
		System.out.println("enter stake and goal");
		int stake=Utility.readInt();
		int goal=Utility.readInt();
		System.out.println("enter number of times");
	    int n=Utility.readInt();
	    int ar[]=Utility.gamblers(stake, goal, n);
		System.out.println("number of wins ="+ar[0]);
		System.out.println("percentage wins ="+ar[1]+"%");
		System.out.println("percentage loss ="+ar[2]+"%");

		

	}

}
