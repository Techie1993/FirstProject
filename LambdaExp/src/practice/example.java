package practice;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Hii{
	void show(int num[]);
}

interface Info{
	void display(String[] veh);
}

public class example {

	public static void main(String[] args) {
		
	int data[]= {10,15,25,24,56};	
	Hii H1=Arrays::sort;
	H1.show(data);
		
	// Collecting the data in enhanced for loop
	for(int a:data) {
		System.out.println(a);
	   }
		
	}

}
