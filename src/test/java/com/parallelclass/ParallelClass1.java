package com.parallelclass;

import org.testng.annotations.Test;

public class ParallelClass1 {
	
	@Test
	public void a() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("A");
	}
	@Test
	public void b() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("B");
	}
	@Test
	public void c() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("C");
	}
	@Test
	public void d() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("D");
	}
	@Test
	public void e() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("E");
	}

}
