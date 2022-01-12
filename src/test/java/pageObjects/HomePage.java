package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import global.GlobalData;
import utils.BasePage;

public class HomePage extends BasePage {
	
	static HomePage instance;

	public HomePage(WebDriver driver) {
		super(driver);
	
	}
	
	 public static HomePage getInstance() {

	        if (instance == null) {

	            instance = new HomePage(driver);
	            return instance;
	        }
	        return instance;
	    }
	
	 
	 
	 By searchBox=By.className("search-input");
	 By searchresult=By.xpath("//div[@class='results-container']//div[1]");
	 
	 
	 public void openURL() {
		
		 openURL(GlobalData.WEB_URL);
		 
		 
	 }
	 
	 
	 
	 public void fillSearchBox() {
		 sendText(searchBox,"Hisar");	 
		 
	 }
	 
	 
	 public void selectCity(String textToSelect) {
		List<WebElement> options= findElements(searchresult);
		 for(WebElement option : options){
		        System.out.println(option);
		        if(option.getText().equals(textToSelect)) {
		            System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
		        }
		 
	 }
	 

}
	 
	 

	 
}