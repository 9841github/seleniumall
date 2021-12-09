package com.selenium_Practice;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");
	
	WebDriver ac = new ChromeDriver();
	
ac.get("https://www.amazon.in/amezon/s?k=amezon");
WebElement ll = ac.findElement(By.id("nav-link-accountList"));
Actions gg = new Actions(ac);
gg.moveToElement(ll).build().perform();

ac.findElement(By.xpath("(//span[@class='nav-text'])[6]")).click();



}
}
