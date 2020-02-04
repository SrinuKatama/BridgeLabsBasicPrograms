package com.bridgelabz.logical;

import com.bridgelabz.utility.Utility;

public class StopWatchProgram {

	public static void main(String[] args) 
	{
		
		long start=0,end=0;
		boolean flag=true;
		
		  while(true) 
		  {
			System.out.println("Enter 0 for start the watch or Enter 1 for stop the watch" );
			int b=Utility.readInt();
			if(b==0)
			{
		      start= Utility.stop();
			}
			else if(b==1 && flag)
			   {
				end=Utility.stop();
				break;
			  }
		}
		System.out.println((end-start)/1000+" seconds");

}
}
