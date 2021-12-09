package com.selenium_Practice;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.Spring;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.model.JavascriptDialogOpening;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_Purchse {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajmal\\eclipse-workspace\\Selenium_Projects\\driver\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement ll = driver.findElement(By.name("q"));
		System.out.println("*****searching****");
		ll.sendKeys("iphone");
		System.out.println(ll.getText());
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement jj = driver.findElement(By.xpath("//div[.='APPLE iPhone 12 (Blue, 128 GB)']"));
		jj.click();
		Thread.sleep(4000);
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(1));
		WebElement aa = driver.findElement(By.xpath("(//li[@class='col col-6-12'])[2]"));

		Thread.sleep(4000);
		aa.click();
		System.out.println(aa.getText());

	}
}