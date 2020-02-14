package com.bridgelabz.creational.factorydesign;

public class FactoryImplementation {

	public static void main(String[] args) 
	{
		Computer P=Factorydetails.getComputer("PC", "8GB", "2TB", "2.5GH.s");
	    System.out.println("    PC config : "+P);
		Computer server=Factorydetails.getComputer("Server", "100GB", "1000TB", "2.9GH.s");
		System.out.println("server config : "+server);
		Computer Laptop=Factorydetails.getComputer("Laptop", "8GB", "2TB", "2.7GH.s");
		System.out.println("Laptop config : "+Laptop);



	}

}
