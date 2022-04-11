package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProject {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	public SauceProject(WebDriver driver) {
		
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
