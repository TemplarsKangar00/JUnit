package test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import test.LargestPrimeFactory;

public class JUnitTest {

	@Test
	public void positiveTestGreatestCommonDivisor() {
		LargestPrimeFactor test = new LargestPrimeFactor(600851475143L);
		long result = test.getLargestPrimeFactory();
		assertEquals(6857, result);
	}
}
