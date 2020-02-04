package com.bridgelbaz.basiccoreprogram;



import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) 
	{
		System.out.println("enter the number for harmonic series: ");
		int n=Utility.readInt();
	    float h=Utility.harmonicSeries(n);
		System.out.println("harmonic series value is:"+h);

	}

}
