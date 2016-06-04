package com.waltdisney;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	WebElement search ;
	WebElement search_q;
	
	public HomePage(WebDriver d) {
		driver = d;
		search = driver.findElement(By.xpath(".//*[@id='search-query']"));
		search_q = driver.findElement(By.xpath(".//*[@id='site_search_form']/div[1]/a"));
	}
	
	public WebElement getSearch(){
		return search;
	}
	
	public WebElement getSearchq(){
		return search_q;
	}	
}
