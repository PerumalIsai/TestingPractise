package com.failedtestcase;

import org.testng.annotations.Test;

public class DependsMethod {
	
	@Test (dependsOnMethods= {"test2","test3"})
	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test2");
	}

	@Test
	public void test3() {
		System.out.println("Test3");
	}


}
