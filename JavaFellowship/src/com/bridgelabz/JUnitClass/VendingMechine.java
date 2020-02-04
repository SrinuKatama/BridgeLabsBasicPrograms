package com.bridgelabz.JUnitClass;

import com.bridgelabz.utility.Utility;

public class VendingMechine {

	public static void main(String[] args)
	{
		
		      Utility u=new Utility();
		      System.out.println("please enter money:");
		      int addmoney=Utility.readInt();
		      Utility.vend(addmoney);
		  
	}

}
