package practice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class IncreasingOrder {

	public static void main(String[] args) {
		// Adding elements to the list.
		/*List<Integer>data=Arrays.asList(10,14,25,36,44);
		data.sort((s1,s2)->s1.compareTo(s2));
		System.out.println("Arranging in ascending order\n");
		System.out.println(data);
		System.out.println("Arranging in decending order\n");
		data.sort((s1,s2)->s2.compareTo(s1));
		System.out.println(data);*/
		
		
		List<Integer>digits=Arrays.asList(14,15,25,45,66);
		digits.sort((d1,d2)->d1.compareTo(d2));
		System.out.println(digits);
		System.out.println("Descending order \n");
		digits.sort((d1,d2)->d2.compareTo(d1));
		System.out.println(digits);
		
		System.out.println("Printing the data in straight order.");
		// Printing the data by iterator.
		ListIterator lstitr=digits.listIterator();
		while(lstitr.hasNext()) {
			Object obj=lstitr.next();
			System.out.println(obj);
		}
		System.out.println("Printing the data in previous order\n");
		while(lstitr.hasPrevious()) {
			Object pre=lstitr.previous();
			System.out.println(pre);
		}
				
	}

}
