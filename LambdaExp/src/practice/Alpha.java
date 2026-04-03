package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alpha {

	public static void main(String[] args) {
		// Adding list of colors.
		List<String>comp=Arrays.asList("Barclays","Capg","Accenture","Zoho","Salesforce","TCS");
		comp.sort((C1,C2)->C1.compareTo(C2));
		System.out.println(comp);
		
		ArrayList<String>cars=new ArrayList<>();
		cars.add("Thar");
		cars.add("Tavera");
		cars.add("Gurkha");
		cars.add("Scorpio");
		cars.add("BAIC-BJ40");
		System.out.println(cars);
		cars.sort((C1,C2)->C1.compareTo(C2));
		System.out.println(cars);	
	}

}
