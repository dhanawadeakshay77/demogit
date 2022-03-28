package org.TestNG.test.testng_practice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ebay_sanity {
	
	@Test
	private void empty_search_test() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\ChromeDrivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.findElement(By.id("gh-ac")).sendKeys("shoe");
		//driver.findElement(By.id("gh-btn")).click();
		
		String newTitle=driver.getTitle();
		System.out.println(newTitle);
		Assert.assertEquals(newTitle,"Electronics, Cars, Fashion, Collectibles & More | eBay" );
		
	}
	
}
