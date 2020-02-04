package com.bridgelabz.JUnittesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class VendingMechcineTest {

	@Test

   void given225Amount_whenPassedToVending_thenShouldBeThree()
	{
     assertEquals(3,Utility.vend(225)); 
     }

     

	@Test
	void given1025Amount_whenPassedToVending_thenShouldBeThree()
	{
		assertEquals(3,Utility.vend(1025));
	}
	
}
