package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sorting {

	public static void main(String[] args) {
		// Arranging integers in ascending numbers.
		//int num[]= {10,14,15,25};
		List<Integer>data=Arrays.asList(10,14,25,36,44);
		data.sort((s1,s2)->s1.compareTo(s2));
		System.out.println("Arranging in ascending order\n");
		System.out.println(data);
		System.out.println("Arranging in decending order\n");
		data.sort((s1,s2)->s2.compareTo(s1));
		System.out.println(data);
		
		System.out.println("Arranging the Strings in ascending order\n");
		ArrayList<String>comp=new ArrayList();
		comp.add("Barclays");
		comp.add("CapG");
		comp.add("Accenture");
		comp.add("Zoho");
		System.out.println(comp);
		
		// sorting companies
		System.out.println("Companies in Ascending order\n");
		comp.sort((c1,c2)->c1.compareTo(c2));
		System.out.println(comp);
		System.out.println("Companies in Descending order\n");
		comp.sort((c1,c2)->c2.compareTo(c1));
		System.out.println(comp);
		
		// Converting to Uppercase.
		for(String str:comp) {
			System.out.println(str);
		}
		System.out.println(comp);
		
	}

}
