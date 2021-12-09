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
import org.openqa.selenium.support.ui.Select;

public class Adactin {
public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");
	
	WebDriver driver1 = new ChromeDriver();
	driver1.get("http://adactinhotelapp.com/");
	Thread.sleep(4000);
	driver1.manage().window().maximize();
	driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("Ajmalajju");
	
	driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("asdf@1234");
	driver1.findElement(By.xpath("//input[@name='login']")).click();
	WebElement kk = driver1.findElement(By.xpath("//select[@name='location']"));
	Select se = new Select(kk);
	se.selectByIndex(6);
	System.out.println(kk.getText());
	
	WebElement kk2 = driver1.findElement(By.id("hotels"));
	
	Select se1 = new Select(kk2);
	se1.selectByIndex(2);
	WebElement kk3 = driver1.findElement(By.xpath("//select[@name='room_type']"));
	Select se2 = new Select(kk3);
	se2.selectByVisibleText("Deluxe");
	WebElement kk4 = driver1.findElement(By.xpath("//select[@name='room_nos']"));

Select se3 = new Select(kk4);
se3.selectByValue("3");
WebElement ll = driver1.findElement(By.xpath("//input[@name='datepick_in']"));
ll.clear();
ll.sendKeys("12/12/2021");
WebElement ll1 = driver1.findElement(By.xpath("//input[@name='datepick_out']"));
ll1.clear();
ll1.sendKeys("5/12/2021");

WebElement kk5 = driver1.findElement(By.xpath("//select[@name='adult_room']"));
Select se4 = new Select(kk5);
se4.selectByValue("2");
WebElement kk6 = driver1.findElement(By.xpath("//select[@name='child_room']"));
Select se5 = new Select(kk6);
se5.selectByIndex(2);
WebElement pp = driver1.findElement(By.xpath("//input[@name='Submit']"));
pp.click();


Thread.sleep(4000);
TakesScreenshot ss = (TakesScreenshot)driver1;
File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
File h = new File("./screenshot/img5.png");
FileUtils.copyFile(screenshotAs, h);









}
}
