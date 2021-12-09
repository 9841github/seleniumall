package com.selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Project {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(6000);
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("search-input")).sendKeys("love failure songs in tamil");
	driver.findElement(By.id("search-icon-legacy")).click();
	
	
	driver.findElement(By.xpath("//span[@title='Love failure Songs']")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@title='Play (k)']")).click();
	
	
	
	
	
	
}
}
