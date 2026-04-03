package practice;

import java.util.Scanner;

interface count1{
	void show(String str);
}

public class VowelCount {

	public static void main(String[] args) {
		count1 c1=(a)->{
			// Taking user I/p
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter any input:");
			String in=scan.next();
			int count=0; int conso=0;
			for(int i=0;i<=in.length()-1;i++) {
				if(in.charAt(i)=='a' || in.charAt(i)=='e' || in.charAt(i)=='i' || in.charAt(i)=='o' || in.charAt(i)=='u') {
					count++;
				}else {
					conso++;
				}
				
			}
			System.out.println("The count of Vowels is:"+count);
			System.out.println("The count of Consonents is:"+conso);

		};
		String in = null;
		c1.show(in);
	}

}
