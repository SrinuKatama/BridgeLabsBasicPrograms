package com.bridgelabz.structural.proxy;

import java.io.IOException;

public class Commandexecutorimp implements Commandexecuter 
{

	@Override
	public void runCommand(String cmd)
	{
		try {
			Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("'"+cmd+"' command executed ");
		
		
	}

}
