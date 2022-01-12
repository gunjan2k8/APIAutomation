package testsuite;


import org.testng.annotations.Test;

import base.BaseTestClass;
import pageObjects.CityTempScreen;
import pageObjects.HomePage;


public class ExecutionSuite_GetWeather extends BaseTestClass{
	
	
	@Test
	public void getTemp() {
		
		HomePage homePage = HomePage.getInstance();
		homePage.openURL();
		homePage.fillSearchBox();
		homePage.selectCity("Hisar, Haryana, IN");
		CityTempScreen cityTemp = CityTempScreen.getInstance();
		String tempReading=cityTemp.getTemp();
		System.out.println(tempReading);
		
	}

}
