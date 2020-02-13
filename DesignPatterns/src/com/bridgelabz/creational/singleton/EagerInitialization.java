package com.bridgelabz.creational.singleton;

public class EagerInitialization 
{
	private EagerInitialization() {}
	 private static final EagerInitialization ei=new EagerInitialization();
	 
	 public static EagerInitialization getInstance()
	 {
		 return ei;
	 }


}
