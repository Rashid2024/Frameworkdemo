package epack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
	WebDriver driver;
	ExtentReports extent;

   @BeforeMethod
   public void configuration() {
	   
	   String reportPath = System.getProperty("user.dir")+"\\reports\\index.html";
	   
	   ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
	   reporter.config().setReportName("Sauce Test Report");
	   reporter.config().setDocumentTitle("Sauce Test Report Title");
	   
	   extent = new ExtentReports();
	   extent.attachReporter(reporter);
	   extent.setSystemInfo("Operating System", "Windows 10");
	   extent.setSystemInfo("Tested by", "Harun Ali");
	   
	   
   }
	
	
	@Test
	public void testOne() {
		
		ExtentTest eTest = extent.createTest("Sauce Demo Test");
		
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		
		eTest.info("Chrome Browser launched");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com");
		eTest.info("Application launched");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		String text = driver.findElement(By.xpath("//span[@class='title']")).getText();
		eTest.info("Test completed");
		
		Assert.assertEquals(text, "PRODUCTS");
		
		
	}
    
    @AfterMethod
    public void tearDown() {
    	
    	driver.close();
    	extent.flush();
    	
    }

}
