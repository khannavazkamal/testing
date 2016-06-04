package com.waltdisney;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest extends BrowserFactory{
	WebDriver driver;
	HomePage hp;
	
	@BeforeClass
	public void init(){
		// perform test specific initialization
		driver = BrowserFactory("firefox","http://waltdisneystudios.com");
		hp = new HomePage(driver);
	}

	@Test
	public void test1() throws InterruptedException{
		WebElement search = hp.getSearch();
		WebElement search_q = hp.getSearchq
				();
		search.sendKeys("cars");
		search_q.click();
		
		List<WebElement> ads = driver.findElements(By.xpath(".//*[@id='search-results-listing']/div"));
		
		int i= 1;
		for (WebElement ad:ads){
			ad.findElement(By.id(".//*[@id='search-results-listing']/div["+i+"]/h4/a'")).click();			
		}
	}
	
	@AfterClass
	public void cleanup(){
		driver.close();	
	}
	
}