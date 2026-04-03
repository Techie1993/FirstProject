package practice;

import java.util.Scanner;

interface count{
	void show(String str);
}

public class LambdaVowel {

	public static void main(String[] args) {
		//LambdaVowel V1=new LambdaVowel();
		
		count c1=(String str)->{
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any input:");
		String in=scan.next();
		int count=0;int conso=0;
		for(int i=0;i<=in.length()-1;i++) {
			if(in.charAt(i)=='a' || in.charAt(i)=='e' || in.charAt(i)=='i' || in.charAt(i)=='o' || in.charAt(i)=='u') {
				count++;
			}else {
				conso++;
			}
		}
			System.out.println("The count of vowels is:"+count);
			System.out.println("The count of vowels is:"+conso);	
		};
		String in = null;
		c1.show(in);

	}

}
