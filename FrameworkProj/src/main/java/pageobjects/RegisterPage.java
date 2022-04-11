package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='My Account']")
	WebElement MyAccount;
	
	@FindBy(linkText="Register")
	WebElement registerOption;
	
	@FindBy(name="firstname")
	WebElement firsttName;
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	@FindBy(name="email")
	WebElement enterEmailAddress;
	
	
	
	public WebElement MyAccount() {
		return MyAccount;
					
	}
	
	public WebElement registerOption() {
		 return registerOption;
		 	  	 
	}
    
	public WebElement firsttName() {
		
		return firsttName;
	}
	
	public WebElement lastName() {
		
		return lastName;
	}
	
	public WebElement enterEmailAddress() {
		
		return enterEmailAddress;
	}
	

}
