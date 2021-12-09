package com.selenium_Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class drop_down {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
WebElement kk = driver.findElement(By.name("birthday_day"));
Select se = new Select(kk);
se.selectByIndex(4);
WebElement kk1 = driver.findElement(By.name("birthday_month"));
Select se1 = new Select(kk1);
se1.selectByVisibleText("Aug");
List<WebElement> ll = se1.getOptions();

int size = ll.size();
System.out.println(size);
for (int i = 0; i <size; i++) {
	if   (i==4) {
		
	
			System.out.println(ll.get(i).getText());
		
	}
	if (i==5) {
		System.out.println(ll.get(i).getText());
	}
	else {
		System.out.println(ll.get(i).getText());
	}
	//	
}
}
}
