package utils;

public class TempVariance {

	
public static String VarTemp(String tempFrUI, float tempFrAPI, float range) throws MyCustomException {
		float tempUI = Float.valueOf(tempFrUI);
		float tempAPI = (float) (tempFrAPI - 273.15f);

		float diff = tempUI - tempAPI;

		if (diff > range)
			throw new MyCustomException("UI and API temperature are not in the same range");
		else
			return "success";
	}
	
	
}
