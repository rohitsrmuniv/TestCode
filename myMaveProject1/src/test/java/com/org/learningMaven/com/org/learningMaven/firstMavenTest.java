package com.org.learningMaven.com.org.learningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firstMavenTest {

	@Test
	public void login()
	{
		System.out.println("Hello World 123");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	
}
