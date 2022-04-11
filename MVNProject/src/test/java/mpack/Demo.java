package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromiumdriver().setup();	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
	driver.findElement(By.xpath("//a[@title='My Account']")).click(); 
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Rashidtfl2020@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Xoriy@83");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Account']")).isDisplayed();
	
	
	
	}

}
