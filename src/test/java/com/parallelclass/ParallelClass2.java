package com.parallelclass;

import org.testng.annotations.Test;

public class ParallelClass2 {
	@Test
	public void aa() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("AA");
	}
	@Test
	public void bb() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("BB");
	}
	@Test
	public void cc() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("CC");
	}
	@Test
	public void dd() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("DD");
	}
	@Test
	public void ee() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("EE");
	}

}
