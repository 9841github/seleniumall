package com.selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");

		WebDriver h = new ChromeDriver();
		h.get("https://www.youtube.com/");
		h.navigate().to("https://www.youtube.com/results?search_query=doctor+song");
		h.navigate().to("https://www.youtube.com/watch?v=FyF9CRGb2VU");
		
		h.navigate().back();
		h.navigate().refresh();
		String title = h.getTitle();
		System.out.println(title);
		String currentUrl = h.getCurrentUrl();
		System.out.println(currentUrl);
		h.navigate().to("https://www.youtube.com/results?search_query=kannamma+serial");
		h.navigate().to("https://www.youtube.com/watch?v=w5zyO_d_1LU");
		
		
	}
}
