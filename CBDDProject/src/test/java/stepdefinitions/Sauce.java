package stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sauce {
	
	WebDriver driver;
	
	@Given("^I navigate to appliction URL$")
    public void i_navigate_to_appliction_url() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		
    }

    @When("^I enter user as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_user_as_and_password_as(String username, String password)  {
    	
    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    	
    
        
    }


    @And("^I click login button$")
    public void i_click_login_button()  {
    	
    	driver.findElement(By.xpath("//input[@id='login-button']")).click();
        
    }
    
    @Then("^User should be able to login based \"([^\\\"])*\" status$")
    public void user_should_be_able_to_login_based_status(String expected)  {
    	
    	 
    	//   WebElement products = null
        //  Assert.assertNotNull("");
        // 	products = driver.findElement(By.xpath("//span[@class='title']"));
    	
    	
    	
    	
    	System.out.println("Expected results methos execute");
    	
        
    }


}
