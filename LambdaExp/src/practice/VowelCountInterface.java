package practice;

import java.util.Scanner;

// Counting the number of vowels and consonants in string.

interface Vowels{
	void show(String str);
}

class MyVowels{
	public static String VowCount(String str) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any data:");
		String data=scan.next();
		int count=0; int conso=0;
		for(int i=0;i<=data.length()-1;i++) {
			if(data.charAt(i)=='a' || data.charAt(i)=='e' || data.charAt(i)=='i' || data.charAt(i)=='o' || data.charAt(i)=='u') {
				count++;
			}else {
				conso++;
			}
		}
		System.out.println("The vowel count is:"+count);
		System.out.println("the consonent count is:"+conso);
		
		return data;
	}
}


public class VowelCountInterface {

	public static void main(String[] args) {
		Vowels V1=MyVowels::VowCount;
		String data = null;
		V1.show(data);

	}

}
