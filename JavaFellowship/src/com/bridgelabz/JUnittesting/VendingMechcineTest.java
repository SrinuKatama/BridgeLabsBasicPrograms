package com.bridgelabz.JUnittesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class VendingMechcineTest {

	@Test
	void test()
	{
		assertEquals(3,Utility.vend(225));
	}

}
