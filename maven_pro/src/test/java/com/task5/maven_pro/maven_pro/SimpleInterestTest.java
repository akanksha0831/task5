package com.task5.maven_pro.maven_pro;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTest {

	private static final double PRECISION = 0.00001;
	@Test
	public void test() {
		Interest test = new Interest();
		double output = test.SimpleInterest(6000, 15, 7);
		assertEquals(6300.00,output,PRECISION);
	}

}
