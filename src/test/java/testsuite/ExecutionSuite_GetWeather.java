package testsuite;


import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import base.BaseTestClass;
import global.GlobalData;
import io.restassured.response.Response;
import pageObjects.CityInfo;
import pageObjects.CityTempScreen;
import pageObjects.HomePage;
import utils.TempComparator;
import utils.TempVariance;


public class ExecutionSuite_GetWeather extends BaseTestClass{
	
	public String tempReadingFromUI;
	public int tempReadingFromAPI;
	

	@Test
	public void getTempFrUI() {
		
		// program to get temperature reading from UI
		HomePage homePage = HomePage.getInstance();
		homePage.openURL();
		homePage.fillSearchBox("Hisar");
		homePage.selectCity("Hisar, Haryana, IN");
		CityTempScreen cityTemp = CityTempScreen.getInstance();
		tempReadingFromUI=cityTemp.getTemp().substring(0,2);
		System.out.println(tempReadingFromUI);
	
		// program to get temperature reading from API
		Response response = given().
				spec(requestSpec).
				queryParam("appid", GlobalData.APP_ID).
				queryParam("q", "Hisar").
			when().
				get("/data/2.5/weather");

		CityInfo cityInfo = response.as(CityInfo.class);
		double temp=cityInfo.getMain().getTemp();

		float tempReadingFromAPI=(float) (temp);
		TempComparator.comparing(tempReadingFromUI, tempReadingFromAPI);

		try {
			if (TempVariance.VarTemp(tempReadingFromUI, tempReadingFromAPI, GlobalData.range) == "success")
				System.out.println("Temp variance within range");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
