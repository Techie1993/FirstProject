package practice;

import java.util.Scanner;

public class FactoPractice {

	public static void main(String[] args) {
		// Taking user I/P
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any data:");
		int data=scan.nextInt();
		
		long factorial=1;
		for(int i=1;i<=data;i++) {
			factorial=factorial*i;
		}
		System.out.println("The value is:"+factorial);
	}

}
