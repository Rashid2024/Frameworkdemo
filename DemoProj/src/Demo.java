import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10242232\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//input[@id='user-name']"));
		element.sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		WebElement test1 = driver.findElement(By.xpath("//span[@class='title']"));
		boolean b1 = test1.isDisplayed();
		
		if(test1.isDisplayed()) {
			
			System.out.println("Element is displayed " + b1);
		}
			  
		else {
			
			System.out.println("Element is not displayed");
		}
	}

}
