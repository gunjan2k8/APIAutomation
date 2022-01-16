package pageObjects;

import java.util.Comparator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class CityTempScreen extends BasePage{
	
	static CityTempScreen instance;

	public CityTempScreen(WebDriver driver) {
		super(driver);
	
	}
	
	 public static CityTempScreen getInstance() {

	        if (instance == null) {

	            instance = new CityTempScreen(driver);
	            return instance;
	        }
	        return instance;
	    }
	
	 By tempValue=By.xpath("//div[@class='cur-con-weather-card__panel']//div[@class='temp']");
	 
	 public String getTemp() {
		
		 String reading=getText(tempValue);
		 return reading;
		 
		 
	 }

	 
	
	
	 
	 
	

}
