package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.RegisterPage;
import resources.Base;

public class RegisterTest extends Base{
	
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() throws IOException {
		
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		
	}

	@Test
	public void Register () {
		
		LandingPage LandingPage = new LandingPage(driver);
		LandingPage.MyAccount().click();
		
		RegisterPage RegisterPage = new RegisterPage(driver);
		
		RegisterPage.registerOption().click();
		RegisterPage.firsttName().sendKeys("Adam");
		RegisterPage.lastName().sendKeys(prop.getProperty("lastname"));
		RegisterPage.enterEmailAddress().sendKeys(prop.getProperty("email"));
	}

}
