package com.bridgelabz.structural.proxy;

public class CommandexecutorProxy implements Commandexecuter
{
	private boolean isAdmin;
	private Commandexecuter executor;
	
	
	public CommandexecutorProxy(String user,String pwd) 
	{
		super();
		if("sri".equals(user) && "123" .equals(pwd))
		{
			isAdmin=true;
		}
	
	}
	@Override
	public void runCommand(String cmd) throws Exception 
	{
		if(isAdmin)
		{
			executor.runCommand(cmd);
		}
		else if(cmd.trim().startsWith("rm"))
		{
			throw new Exception("rm command is not allowed for non-admin users.");
		}
		else
		{
			executor.runCommand(cmd);
		}
		
		
		
	}

}
