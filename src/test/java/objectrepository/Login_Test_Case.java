package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test_Case {
	
	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\ChromeDrivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://kite.zerodha.com/");
		 Thread.sleep(2000);
	}
	@Test
    void login() {
    	Login lp=new Login(driver);
    	lp.setusername("WF3390");
    	lp.setpass("");
    	lp.click();
    
	
}
}
