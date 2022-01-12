package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import global.GlobalData;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.BasePage;

public class BaseTestClass{
	
          static WebDriver driver;
          BasePage basePage;

          protected static RequestSpecification requestSpec;
      	protected static ResponseSpecification responseSpec;
      	
    	@BeforeSuite
    	public void setBaseURI() {
    		
    		requestSpec = new RequestSpecBuilder().
                    		setBaseUri(GlobalData.Base_URI).
                    		build();
            
    	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void beforeSuite(String browser) {
		
		if(browser.equalsIgnoreCase("chrome"))
			initChromeDriver();
		else
			initFirefoxDriver();
		basePage= new BasePage(driver); 
		responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();
		
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
