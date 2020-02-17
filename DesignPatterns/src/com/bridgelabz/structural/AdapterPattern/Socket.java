package com.bridgelabz.structural.AdapterPattern;

public class Socket 
{
	public Volt getVolt()
	{
	return new Volt(120);
    }
}
