package com.bridgelabz.creational.factorydesign;

public class PC extends Computer
{
	String RAM;
	String HDD;
	String CPU;
	

	
	public PC(String RAM, String HDD, String CPU) {
		super();
		this.RAM = RAM;
		this.HDD = HDD;
		this.CPU = CPU;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.RAM;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.HDD;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}
  
	

}
