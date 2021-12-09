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

public class Task_6 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");

WebElement mm = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
mm.click();
driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
Alert kk = driver.switchTo().alert();

Thread.sleep(4000);
kk.sendKeys("vanakkam");
System.out.println(kk.getText());
Thread.sleep(4000);
kk.accept();
TakesScreenshot a = (TakesScreenshot)driver;
File pp = a.getScreenshotAs(OutputType.FILE);
File o = new File("./screenshot/img1.png");
FileUtils.copyFile(pp, o);
	}
}
