package com.selenium_Practice;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");
		WebDriver jj = new ChromeDriver();
		jj.manage().window().maximize();
		jj.get("https://www.irctc.co.in/nget/train-search");
		WebElement element = jj.findElement(By.id(""));
		element.click();
		

		Thread.sleep(3000);
		Alert ll = jj.switchTo().alert();
		
		Thread.sleep(4000);
		ll.accept();
		
		TakesScreenshot ss = (TakesScreenshot) jj;
		File h = ss.getScreenshotAs(OutputType.FILE);
		File k = new File("C:\\Users\\Ajmal\\eclipse-workspace\\KING\\screenshot\\alert.png");
		FileUtils.copyFile(h, k);

	}
}
