package testsuite;


import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTestClass;
import global.GlobalData;
import io.restassured.response.Response;
import pageObjects.CityInfo;
import pageObjects.CityTempScreen;
import pageObjects.HomePage;


public class ExecutionSuite_GetWeather extends BaseTestClass{
	
	public static String tempReadingFromUI=null;
	public static String tempReadingFromAPI=null;
	
	
	@Test
	public void getTempFrUI() {
		
		HomePage homePage = HomePage.getInstance();
		homePage.openURL();
		homePage.fillSearchBox();
		homePage.selectCity("Hisar, Haryana, IN");
		CityTempScreen cityTemp = CityTempScreen.getInstance();
		tempReadingFromUI=cityTemp.getTemp().substring(0,2);
		System.out.println(tempReadingFromUI);
	
		
		Response response = given().
				spec(requestSpec).
				queryParam("appid", GlobalData.APP_ID).
				queryParam("q", "Hisar").
			when().
				get("/data/2.5/weather");
		
		//Verify the response code
		response.then().spec(responseSpec).log().all();
		
		CityInfo cityInfo = response.as(CityInfo.class);
		
		double temp=cityInfo.getMain().getTemp();
		
		System.out.println(temp);
		
		double kelvinTopCelcius=temp-273.15;
		
	String value= String.valueOf(kelvinTopCelcius);
	
	String tempReadingFromAPI= value.substring(0,2);
		
	
		
    Assert.assertEquals(tempReadingFromAPI, tempReadingFromUI);
		
	}
	
	
	

}
