package com.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_112 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajmal\\eclipse-workspace\\Selenium_Projects\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement kk = driver.findElement(By.xpath("//input[@name='search_query']"));
		kk.click();
		kk.sendKeys("surya love failure songs ");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,1100);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1100);");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();

		
	}
}
