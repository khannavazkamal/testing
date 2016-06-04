package com.waltdisney;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory extends BaseClass {
	WebDriver driver;
	
	public WebDriver BrowserFactory(String browser, String url){
		System.out.println("path:"+TEST_PATH);
		if (browser.toLowerCase().equals("firefox"))
			driver = new FirefoxDriver();


		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
}
