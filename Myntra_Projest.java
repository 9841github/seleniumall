package com.selenium_Practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Projest {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQiA4b2MBhD2ARIsAIrcB-QaienotzUAGTrblbOtaxD5sU4LNsP9_E_tB5nderI97ZrFyTxC6lYaAgq_EALw_wcB");
driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("handbags");
driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[4]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//label[@class='vertical-filters-label common-customCheckbox'])[2]")).click();
Thread.sleep(5000);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1000);");

driver.findElement(By.xpath("//img[@title='POKORY Black & White Suede Structured Shoulder Bag with Applique']")).click();
ArrayList<String>newtab= new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(newtab.get(1));
driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
Thread.sleep(4000);
  
WebElement gg = driver.	findElement(By.xpath("//a[.='GO TO BAG']"));
gg.click();
System.out.println(driver.getCurrentUrl());








}
}
