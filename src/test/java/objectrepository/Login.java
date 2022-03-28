package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver ldriver;
	
	Login (WebDriver rdriver){
		ldriver=rdriver;
	 PageFactory.initElements(rdriver,this);
	}
@FindBy(id="userid") 
WebElement txtusername;

@FindBy(id="password")
WebElement txtpass;

@FindBy(className="actions")
WebElement btn;

@FindBy(id="pin")
WebElement txtpin;

@FindBy(className="actions")
WebElement btn2;

public void setusername(String uname) {
	txtusername.sendKeys(uname);
}
public void setpass(String passward) {
	txtpass.sendKeys(passward);
}
public void click() {
	btn.click();
}
public void setpin(String pin) {
	txtpass.sendKeys(pin);
}
public void click1() {
	btn2.click();

}
}
