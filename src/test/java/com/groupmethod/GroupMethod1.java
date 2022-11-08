package com.groupmethod;

import org.testng.annotations.Test;

public class GroupMethod1 {
	
	@Test(groups = {"sanity","reg"})
	public void test1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TEST1");
	}
	@Test(groups = {"sanity","reg"})
	public void test2() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TEST2");
	}
	@Test(groups = {"smoke","reg"})
	public void test3() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TEST3");
	}
	@Test(groups = {"smoke","reg"})
	public void test4() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TEST4");
	}
	@Test(groups = {"reg"})
	public void test5() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("TEST5");
	}

}
