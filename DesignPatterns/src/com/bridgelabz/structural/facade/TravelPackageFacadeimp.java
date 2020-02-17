package com.bridgelabz.structural.facade;

public class TravelPackageFacadeimp implements TravelPackageFacade
{

	@Override
	public void book() 
	{
		
		Flightbookingimp fb=new Flightbookingimp();
		fb.book();
		
		HotelBookingimp hb=new HotelBookingimp();
		hb.book();
		
		 TransferBookingimp tb=new  TransferBookingimp();
		 tb.book();
		 
	
		System.out.println("Travel package booked successfully");
		
	}

}
