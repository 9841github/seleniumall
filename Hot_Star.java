package com.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hot_Star {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//driver_//chromedriver.exe");
WebDriver jj = new ChromeDriver();
jj.get("https://www.hotstar.com/in");
jj.findElement(By.xpath("//input[@type='search']")).click();
jj.findElement(By.xpath("//input[@type='search']")).sendKeys("bigboss");
}
}
