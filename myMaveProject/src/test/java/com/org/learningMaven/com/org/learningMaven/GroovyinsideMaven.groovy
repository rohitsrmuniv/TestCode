package com.org.learningMaven.com.org.learningMaven

import geb.Browser
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver;

class GroovyinsideMaven {
	
	static main(args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe")
		Browser driver=new Browser(browser: new FirefoxDriver())
		System.out.println("Hello World 234")
		//WebDriver driver=new FirefoxDriver();
		driver.go('https://www.gmail.com')
//		pause(driver)
//		driver.getTitle()
		//assert driver.page.title==""
		//driver.get("");
		
	}

}
