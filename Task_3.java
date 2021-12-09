package com.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_3 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");
	
	WebDriver re = new ChromeDriver();
	
	re.get("https://www.youtube.com/");
	WebElement fi = re.findElement(By.name("search_query"));
	fi.sendKeys("cars");
	
	WebElement search = fi.findElement(By.id ("search-button-narrow"));
	search.click();
	boolean enabled = search.isEnabled();
	System.out.println(enabled);
	WebElement findElement = re.findElement(By.id("search_query"));
	findElement.sendKeys("bikes");
	WebElement search1 = re.findElement(By.id("search-icon-legacy"));
	findElement.click();
}
}
