package com.bridgelabz.creational.singleton;

public class LazyInitialization 
{
	private LazyInitialization () {}
	private static LazyInitialization li;
	public static LazyInitialization getInstance()
	{
		if(li==null)
		{
			li=new LazyInitialization ();
		}
		return li;
	}
	

}
