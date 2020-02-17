package com.bridgelabz.structural.proxy;

public class ProxyPatternTest 
{
	public static void main(String[] args) 
	{
		
	
	Commandexecuter exe=new CommandexecutorProxy("sri","123");
	try {
		exe.runCommand("ls -ltr");
	} catch (Exception e) {
		System.out.println("Exception Message::"+e.getMessage());
	}
	
	}
}
