package com.testing.SeleniumX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyTestNGTest {

	@Test
	public void navigate() {
		System.out.println("opening browser");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	
	
}
