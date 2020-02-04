package com.bridgelabz.JUnittesting;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.bridgelabz.utility.Utility;


public class BinaryTest 
{
	@Test
	public void testcalc()
	{
		assertEquals(100,Utility.Bin(4));
		
	}
	
	@Test
	public void testFor10()
	{
		assertEquals(1010,Utility.Bin(10));
	}
	@Test
	public void testFor11()
	{
		assertEquals(1010,Utility.Bin(11));
	}

	

}
