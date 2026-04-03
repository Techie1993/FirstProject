package practice;

import java.util.ArrayList;

@FunctionalInterface
interface A1{
	void m1(int a);
}


public class ListInterface {

	public static void main(String[] args) {
		A1 i1=(a)->{
			if(a%2==0) {
				System.out.println("The number is even:");
			}else {
				System.out.println("The number is Odd:");
			}
			
		};
		
		i1.m1(24);
	}
	
	
}
