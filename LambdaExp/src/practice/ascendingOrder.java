package practice;

import java.util.Arrays;

interface ArrData{
	void show(int[] details);
}


public class ascendingOrder {

	public static void main(String[] args) {
		int digit[]= {12,17,10,15,55,2,5};
		ArrData A1=Arrays::sort;
		A1.show(digit);
		
		for(int a:digit) {
			System.out.println(a);
		}
	}

}
