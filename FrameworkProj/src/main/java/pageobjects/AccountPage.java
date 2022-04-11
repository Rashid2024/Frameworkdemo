package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Edit your account information")
	  WebElement editAccountInformationLink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[contains(text(),'Phones & PDAs')]")
	  WebElement phoneTab;
	
	
	public WebElement editAccountInformationLink() {
		
		 return editAccountInformationLink;
		 
	}
	
	public WebElement phoneTab() {
		
		return phoneTab;
	}
	 

}
