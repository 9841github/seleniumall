package com.selenium_Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public abstract class Task_xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");
	
WebDriver n = new ChromeDriver();	
	n.get("https://www.facebook.com/");
	n.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(4000);
	n.findElement(By.name("firstname")).sendKeys("Ajmal");
	n.findElement(By.name("lastname")).sendKeys("ajju");
	n.findElement(By.name("reg_email__")).sendKeys("ajju@gmail.com");
	
	n.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("9841336");
	n.findElement(By.id("year")).click();
n.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	WebElement l = n.findElement(By.xpath("//h2[ contains( text(),'people in your life')]"));
	//String p = l.getText();
	//sysoutSystem.out.println(p);
	System.out.println(l.getText());
	


}
}
