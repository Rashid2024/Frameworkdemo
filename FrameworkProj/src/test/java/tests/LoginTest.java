package tests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LogingPage;
import resources.Base;

public class LoginTest extends Base {
	
	WebDriver driver;
	
	@Test (dataProvider="getLoginData")
	public void login(String email, String password, String expectedStatus) throws IOException, InterruptedException {
		
		 
		  
		  LandingPage LandingPage = new LandingPage(driver);
		  
		  LandingPage.MyAccount().click();
		  LandingPage.loginOption().click();
		  
		  Thread.sleep(3000);
		  
		  LogingPage LogingPage = new LogingPage(driver);
		  
		  LogingPage.emailAddmessField().sendKeys(email);
		  LogingPage.passwordField().sendKeys(password);
		  LogingPage.submitButton().click();
		  
		  
		  AccountPage AccountPage = new AccountPage(driver);
		  String  actualResult;
		  
		  try {
			  AccountPage.editAccountInformationLink().isDisplayed();
			    actualResult = "successfull";
			    System.out.println("Inside the try  block");
			}
			catch(Exception e) {
				actualResult = "failed";
				System.out.println("Inside the catch block");
			}
		  
		  Assert.assertEquals(actualResult, expectedStatus);
		  
		  AccountPage.phoneTab().click();
		  
		  
		  
		 
}
	
	@BeforeMethod
	public void openApplication() throws IOException {
		
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		
		
	}
	
	
	@AfterMethod
	public void closure() {
		
		driver.close();
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		
		Object [] [] data = {{"Rashidtfl2020@gmail.com","Xoriy@83","successfull"}};
		
		   return data;
		
	}
	
	
}