package practice;

import java.util.ArrayList;

public class Chronology {

	public static void main(String[] args) {
		// Adding data into the ArrayList.
		ArrayList<String>cars=new ArrayList<String>();
		cars.add("Bolero Camper");
		cars.add("Accent");
		cars.add("Safari");
		cars.add("Santro");
		cars.add("XUV-500");
		cars.sort((s1,s2)->s1.compareTo(s2));
		System.out.println("The increasing sequence is:"+cars);
		System.out.println("The decending order is:\n");
		cars.sort((s1,s2)->s2.compareTo(s1));
		System.out.println("The decending order is:"+cars);

	}

}
