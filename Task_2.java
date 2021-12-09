package com.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");
WebDriver kl = new ChromeDriver();

	kl.get("https://www.facebook.com/");
	WebElement find = kl.findElement(By.id("email"));
	find.sendKeys("the king");
	  WebElement ref = kl.findElement(By.id("pass"));
	ref.sendKeys("vanakkam");
	WebElement findEl = kl.findElement(By.name("login"));
	findEl.click();
	boolean l = findEl.isSelected();
	System.out.println(l);
	
	
}
}
