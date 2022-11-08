package com.groupmethod;

import org.testng.annotations.Test;

public class GroupMethod2 {
	
	@Test(groups = {"sanity","reg"})
	public void test6() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TEST6");
	}
	@Test(groups = {"sanity","reg"})
	public void test7() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TEST7");
	}
	@Test(groups = {"smoke","reg"})
	public void test8() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TEST8");
	}
	@Test(groups = {"smoke","reg"})
	public void test9() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TEST9");
	}
	@Test(groups = {"reg"})
	public void test10() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TEST10");
	}
	

}
