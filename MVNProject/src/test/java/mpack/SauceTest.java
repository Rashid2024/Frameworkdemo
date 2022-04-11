package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceTest {
@Test
	public void SauceLogin() {
	
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		Sauce sc = new Sauce(driver);
		boolean isEmailFieldPresent = sc.verifyFieldIsValid();
		Assert.assertTrue(isEmailFieldPresent);
	
		
	}

}
