package com.selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_5 {
private static Object system;
private Object fileutiles;

public static void main(String[] args) throws IOException {
	system.setProperty("webdrier.chrome.driver", "C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.findElement(By.name("First Name")).sendKeys("ajmal");
	//driver.get("https://www.instagram.com/accounts/login/");
	//WebElement ll = driver.findElement(By.name("username"));
	
	//ll.sendKeys("ajmal123");
	//WebElement pp = driver.findElement(By.name("password"));
	//pp.sendKeys("984136");
	//TakesScreenshot u = (TakesScreenshot)driver;
	//File t = u.getScreenshotAs(OutputType.FILE);
	//File d = new File("C:\\Users\\Ajmal\\eclipse-workspace\\KING\\screenshot//insta.png");
	//FileUtils.copyFile(t, d);
}
}
