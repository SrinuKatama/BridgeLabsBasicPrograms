package com.bridgelabz.creational.singleton;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializationandSingleton implements Serializable
{
	private SerializationandSingleton() {}
	
	private static class inner
	{
		private static final SerializationandSingleton st=new SerializationandSingleton();
	}
	
	public static SerializationandSingleton getInstance()
	{
		return inner.st;
	}

}
