package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import global.GlobalData;

public class BasePage implements GlobalData {
	
	public static WebDriver driver;
	  public WebDriverWait wait;
	  
	  
	    //Constructor
	    public BasePage (WebDriver driver){
	        BasePage.driver = driver;
	        wait = new WebDriverWait(driver,GlobalData.ELEMENT_TIMEOUT);
	    }

		
	    public  void openURL(String url) {
	        driver.get(url);
	        driver.manage().window().maximize();
	        gotoSleep(GlobalData.SLEEP_TIMEOUT);

	    }


	    public void gotoSleep(int miliSeconds) {
	        try {
	            Thread.sleep(miliSeconds);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public  void setImplicitWait(int seconds) {
	       driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	    }

	    public  void waitUntilElementVisible(By by) {
	        WebDriverWait wait = new WebDriverWait(driver, GlobalData.ELEMENT_TIMEOUT);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	    }

	    public  WebElement findElement(By by) {
	        waitUntilElementVisible(by);
	        return driver.findElement(by);
	    }
	    
	    public  List<WebElement> findElements(By by) {
	        waitUntilElementVisible(by);
	        return driver.findElements(by);
	    }
	    
	    public  void click(By by) {
	        
	            findElement(by).click();
	        
	    }
	    
	    
	    
	    public  String getText(By by) {
	        String text = findElement(by).getText();
	        return text;
	    }
	    
	    public  void sendText(By by, String text) {
	        findElement(by).sendKeys(text);
	       
	    }
		

		 public void assertEquals (By elementBy, String expectedText) {
			 waitUntilElementVisible(elementBy);
		        Assert.assertEquals(getText(elementBy), expectedText);
		    }

	    
	    
}
