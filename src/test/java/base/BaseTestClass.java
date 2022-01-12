package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.BasePage;

public class BaseTestClass{
	
          static WebDriver driver;
          BasePage basePage;

	
	@Parameters({"browser"})
	@BeforeMethod
	public void beforeSuite(String browser) {
		
		if(browser.equalsIgnoreCase("chrome"))
			initChromeDriver();
		else
			initFirefoxDriver();
		basePage= new BasePage(driver); 
		
	}
	
	public void initChromeDriver() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
	}
	
public void initFirefoxDriver() {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
	}


//
//   @AfterMethod
//   public void tearDown() {
//	driver.quit();
//     }
//	

}
