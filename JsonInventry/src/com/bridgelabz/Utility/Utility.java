package com.bridgelabz.Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Utility 
{
	private static Scanner sc;
	private static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	static
	{
		sc=new Scanner(System.in);
	}
	//to read integer.
	public static  int readInt()
	{
		return sc.nextInt();
	}
	//to read long integer.
	public static long readlong()
	{
		return sc.nextLong();
	}
	//to read String.
	public static String readString()
	{
		return sc.nextLine();
	}
	//to read String buffer.
	public static String bufferScanner() throws IOException
	{
	return br.readLine();
	}
	//to read double.
	public static  double readdouble()
	{
		return sc.nextDouble();
	}
	//to read boolean.
	public static  boolean readBoolean()
	{
		return sc.nextBoolean();
	}

	

}
