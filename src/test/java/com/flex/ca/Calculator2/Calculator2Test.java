package com.flex.ca.Calculator2;

import org.junit.Test;

import junit.framework.TestCase;

public class Calculator2Test extends TestCase {
	
	@Test
	public void testSum() {
	System.out.println("sum");
	Integer x = 15;
	Integer y = 15;
	Integer expResult = 30;
	Integer result = Calculator2.sum(x, y);
	assertEquals(expResult, result);
	assertEquals(null, Calculator2.sum(15, null));
	assertEquals(null, Calculator2.sum(null, 15));
	assertEquals(null, Calculator2.sum(null, null));
	}


	public void testSub() {
	System.out.println("sub");
	Integer x = 15;
	Integer y = 15;
	Integer expResult = 0;
	Integer result = Calculator2.sub(x, y);
	assertEquals(expResult, result);
	assertEquals(null, Calculator2.sub(15, null));
	assertEquals(null, Calculator2.sub(null, 15));
	assertEquals(null, Calculator2.sub(null, null));
	}

}
