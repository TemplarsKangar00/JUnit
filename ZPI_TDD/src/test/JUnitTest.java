package test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import test.LargestPrimeFactory;

public class JUnitTest {

	@Test
	public void positiveTestGreatestCommonDivisor() {
		LargestPrimeFactory test = new LargestPrimeFactory(1);
		long result = test.getLargestPrimeFactory();
		assertEquals(1, result);
	}
}
