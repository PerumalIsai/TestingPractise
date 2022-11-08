package com.paralleltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	public WebDriver driver;
	
	@BeforeTest
	public void browserLaunch() {
		System.out.println(Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void url() {
		System.out.println(Thread.currentThread().getId());
		driver.get("https://www.facebook.com/login//");
	}
	
	@AfterTest
	public void close() {
		System.out.println(Thread.currentThread().getId());
		driver.close();
	}

}
