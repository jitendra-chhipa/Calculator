package com.jitendra.maven.Calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
Calculator c = new Calculator();
	
	@Test
	public void testAdd()
	{
				
		assertTrue(c.doAdd(10, 20)== 30);
	}
	
	
	@Test
	public void testSub()
	{
		assertTrue(c.doSub(50, 30)== 20);
	}
}
