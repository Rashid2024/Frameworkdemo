package mpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	public Sauce(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean verifyFieldIsValid() {
		
		if(username.isDisplayed())
			
			return true;
		else 
			return false;
	}

}