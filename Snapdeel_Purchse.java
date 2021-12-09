package com.selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Snapdeel_Purchse {
//private Object Timeunit;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajmal\\eclipse-workspace\\Selenium_Projects\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement hh = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(hh).build().perform();
		// Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Semi Automatic']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='electronic grayScale']")).click();
		WebElement kk = driver.findElement(By.xpath("//div[.='DTH Services']"));
		kk.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800);");
		Thread.sleep(5000);
		WebElement pp = driver
				.findElement(By.xpath("(//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ' ] )[8]"));

		ac.moveToElement(pp).build().perform();
		Thread.sleep(4000);
		WebElement dth = driver.findElement(By.xpath("(//div[@class='clearfix row-disc' ] )[8]"));

		dth.click();
		System.out.println(dth.getText());
		Thread.sleep(4000);
		TakesScreenshot ss = (TakesScreenshot) driver;
		File screen = ss.getScreenshotAs(OutputType.FILE);

		File shot = new File("./screenshot/img3.png");
		FileUtils.copyFile(screen, shot);
		//WebElement uu = driver.findElement(By.xpath("//div[@class='col-xs-13 quickProductDescPanel']"));
		//uu.click();
		//System.out.println(uu.getText());
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
        driver.findElement(By.xpath("(//img[@class='product-image wooble'])[4]")).click();
		
		Thread.sleep(4000);
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(1));
		js.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.id("//div[@class='col-xs-6 marR15 btn btn-xl btn-theme-secondary rippleWhite buyLink']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Proceed To Checkout']")).click();
		driver.navigate().to("https://www.snapdeal.com/");
		WebElement aa = driver.findElement(By.xpath("(//span[@class='catText'])[6]"));
		ac.moveToElement(aa).build().perform();
		driver.findElement(By.xpath("//span[.='Jackets']")).click();
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//label[@for='Brand-Hangup']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//p[@title='Hangup Multi Checks Casual Blazers']")).click();
		ArrayList<String> newtab1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab1.get(2));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='attr-val'])[2]")).click();

	}
}
