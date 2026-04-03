package practice;

import java.util.Arrays;
import java.util.List;

public class ascending {

	public static void main(String[] args) {
		// Adding elements into the array.
		
		/*
		 * int arr[]= {10,25,44,14,56}; INFO I1=Arrays::sort; I1.show(arr); for(int
		 * a:arr) { System.out.println(a);
		 * 
		 * }
		 */		 
		
		
		
		List<String> data = Arrays.asList("Barclays", "G.E", "Zoho", "TCS", "Salesforce", "HP", "HCL", "Wipro");
		data.sort((c1, c2) -> c1.compareTo(c2));
		System.out.println(data);
		data.sort((c1, c2) -> c2.compareTo(c1));
		System.out.println(data);

	}

}
