package com.bridgelabz.creational.singleton;

public class ThreadSafSingleton 
{
	private ThreadSafSingleton() {}
	
	private static ThreadSafSingleton ts;
	 public static synchronized ThreadSafSingleton getInstance()
	 {
		 if(ts==null)
		 {
			 ts=new ThreadSafSingleton();
		 }
		 return ts;
	 }
	

}
