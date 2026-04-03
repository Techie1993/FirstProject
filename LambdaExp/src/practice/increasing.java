package practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class increasing {

	public static void main(String[] args) {
		// Adding elements to the arrays
		List<Integer>dig=Arrays.asList(2,4,5,6);
		dig.sort((n1,n2)->n2.compareTo(n1));
		System.out.println(dig);
		
		System.out.println("Arranging in ArrayList\n");
		
		ArrayList<Integer>list=new ArrayList();
		list.add(1);
		list.add(10);
		list.add(15);
		list.add(19);
		list.add(13);
		//System.out.println(list);
		
		list.sort((s1,s2)->s2.compareTo(s1));
		System.out.println(list);
		
		System.out.println("Arranging strings in ascending order\n");
		
		ArrayList<String>cars=new ArrayList();
		cars.add("Thar");
		cars.add("Wrangler");
		cars.add("Defendor");
		cars.add("Armada");
		System.out.println(cars);
		
		cars.sort((c1,c2)->c2.compareTo(c1));
		System.out.println(cars);
		
		
		
	}

}
