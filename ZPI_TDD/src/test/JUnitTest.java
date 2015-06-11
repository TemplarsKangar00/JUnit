package test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import test.LargestPrimeFactory;

public class JUnitTest {

	@Test
	public void positiveTestGreatestCommonDivisor() {
		LargestPrimeFactory test = new LargestPrimeFactory(600851475143L);
		long result = test.getLargestPrimeFactory();
		assertEquals(6857, result);
	}

	@Test(expected = Exception.class)
	public void check_Zero_expectedException() {

		new LargestPrimeFactory(0);
		Assert.fail();
	}

	@Test(expected = Exception.class)
	public void check_negativeNumber_expectedException() {

		new LargestPrimeFactory(-10);
		Assert.fail();
	}
}
