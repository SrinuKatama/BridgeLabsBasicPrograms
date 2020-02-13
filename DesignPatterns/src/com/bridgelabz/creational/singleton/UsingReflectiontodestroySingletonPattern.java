package com.bridgelabz.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UsingReflectiontodestroySingletonPattern 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		EagerInitialization ei1= EagerInitialization.getInstance();
		EagerInitialization ei2=EagerInitialization.getInstance();
		
		@SuppressWarnings("rawtypes")
		Constructor[] constructors=EagerInitialization.class.getDeclaredConstructors();
		for(Constructor i:constructors)
		{
			i.setAccessible(true);
			ei2=(EagerInitialization)i.newInstance();
		}
		System.out.println(ei1);
		System.out.println(ei2);
		System.out.println(ei1.hashCode());
		System.out.println(ei2.hashCode()
				);
		
		
	}

}
