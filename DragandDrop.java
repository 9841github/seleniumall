package com.selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");

	WebDriver h = new ChromeDriver();
h.get("http://www.leafground.com/pages/drag.html");
WebElement drag = h.findElement(By.id("draggable"));
WebElement drop = h.findElement(By.id("mydiv"));
Actions join = new Actions (h);
join.dragAndDrop(drag, drop).build().perform();

}
}
