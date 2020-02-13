package com.bridgelabz.creational.singleton;



 class enummain
{
	 public static void main(String[] args)
	 {
		System.out.println(EnumSingleton.doAnytning());

		 
	 }
	
}
 enum EnumSingleton 
{
	
	Instance;
	public static boolean  doAnytning()
	{
		System.out.println(Instance);
		return false;
	}
	 
}



