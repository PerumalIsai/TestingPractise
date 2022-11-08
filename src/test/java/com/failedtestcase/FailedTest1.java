package com.failedtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest1 {
	
	
	@Test(retryAnalyzer = FailedTestRetry.class)
	public void test() {
		Assert.assertEquals("a", "A");
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
	}

}
