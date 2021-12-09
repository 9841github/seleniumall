package com.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");

	WebDriver h = new ChromeDriver();
	h.get("https://letcode.in/frame");
	WebElement kk = h.findElement(By.id("firstFr"));
	h.switchTo().frame(kk);
	h.findElement(By.name("fname")).sendKeys("ajmal");
	WebElement ff = h.findElement(By.xpath("//iframe[@src='innerFrame']"));
	h.switchTo().frame(ff);
	h.findElement(By.name("email")).sendKeys("vanakkam");
	h.switchTo().defaultContent();
}
}
