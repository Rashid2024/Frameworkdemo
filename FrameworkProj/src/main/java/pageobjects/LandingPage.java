package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='My Account']")
	WebElement MyAccount;
	
	@FindBy(linkText="Login")
	WebElement loginOption;
	
	public WebElement MyAccount() {
		return MyAccount;
					
	}
	
	public WebElement loginOption() {
		 return loginOption;
		 	  	 
	}
    

}
