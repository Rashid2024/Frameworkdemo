import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Logger log = LogManager.getLogger(Demo.class.getName());
		
		log.debug("Demo test execution started");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P10242232\\eclipse-workspace\\LogsDemoProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.debug("Chrome launched");
		driver.manage().window().maximize();
		log.debug("Browser maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		log.debug("Navigate to Omayo");
		driver.findElement(By.linkText("compendiumdev")).click();
		log.debug("Clicked on compendiumdev link ");
		driver.navigate().back();
		log.debug("Navigated back to Omoyo Application");
		driver.navigate().forward();
		log.debug("Navigate forward Omayo");
		
		if(driver.getTitle().equals("Basic Web Page Title"))  {
			
			log.info("Success: correct page title is displayed");
			
		}else {
			
			log.error("Failure: wrong page title is displayed");
			
		}
		
		driver.close();
		log.debug("Browsed closed");
	}

}
