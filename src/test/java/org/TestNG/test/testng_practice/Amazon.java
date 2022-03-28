package org.TestNG.test.testng_practice;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Amazon {
	
	
	WebDriver driver=null;
	
	
@Test(priority=1)
public void search() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\ChromeDrivers\\chromedriver.exe");

	 driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in");
	Thread.sleep(5000);
	//String s1=null;
	SoftAssert sa= new SoftAssert();
	String s1=driver.getTitle();
	sa.assertNull(s1);
	
	/*driver.manage().window().maximize();
	String url=driver.getCurrentUrl();
	
	String s1 = null;
	//Assert.assertEquals("https://www.amazon.in/",url);
	//Assert.assertNotEquals("https://www.amazon.in/",url);
	//Assert.assertTrue(url.equals("https://www.amazon.in/"));
    //Assert.assertFalse("InCorrect URL", url.equals("https://www.amazon.in/"));
      Assert.assertNull("No ele present",s1);
      
    */
}
@Test(priority=2)
public void find() throws InterruptedException {	
	Thread.sleep(5000);
	//driver.get("https://www.amazon.in");
   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("shoe");
   driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]")).click();
   
}
@AfterTest
public void close() throws InterruptedException {
	Thread.sleep(5000);
	driver.close();
	System.out.println("Closed Amazon");
}
}		




	
