package utils;

import java.util.Comparator;

public class TempComparator {
	
	
		public static void comparing(String tempFrUI, float tempFrAPI) {
			float tempUI = Float.valueOf(tempFrUI);
			float tempAPI = (float) (tempFrAPI - 273.15);

			if (tempUI > tempAPI)
				System.out.println("UI temp = " + tempUI + " is greater then API temp = " + tempAPI);
			else if (tempUI < tempAPI)
				System.out.println("UI temp = " + tempUI + " is less then API temp = " + tempAPI);
			else
				System.out.println("UI temp = " + tempUI + " is equal to API temp = " + tempAPI);
		}

}
