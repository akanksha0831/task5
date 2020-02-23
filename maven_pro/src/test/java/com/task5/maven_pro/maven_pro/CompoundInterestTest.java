package com.task5.maven_pro.maven_pro;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundInterestTest {

	private static final double PRECISION = 0.00001;
	@Test
	public void test() {
		Interest test = new Interest();
		double output = test.CompoundInterest(6000, 5, 2);
		assertEquals(615,output,PRECISION);
	}
}
