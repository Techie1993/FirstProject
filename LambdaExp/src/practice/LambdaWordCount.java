package practice;

import java.util.Scanner;

@FunctionalInterface
interface Words{
	public void count(int a);
}

@FunctionalInterface
interface vowel{
	public void count(int b);
}


class LambdaWordCount {

	public static void main(String[] args) {
		// Using Lambda Expression.
		Words W1=(a)->{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your input:");
			String in=scan.next();
			int words=0;
			for(int i=0;i<=in.length()-1;i++) {
				if(in.charAt(i)!=' ') {
					words++;
				}
			}
			System.out.println("The count of words is:"+words);
			
		};
		int a = 0;
		W1.count(a);
		
		// Lambda expresiion to count Vowel and consonents.
		vowel V1=(b)->{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your input:");
			String in=scan.next();
			int vowel=0; int conso=0;
			for(int i=0;i<=in.length()-1;i++) {
				if(in.charAt(i)=='a' || in.charAt(i)=='e' || in.charAt(i)=='i' || in.charAt(i)=='o' || in.charAt(i)=='u') {
					vowel++;
				}else if(in.charAt(i)=='A'||in.charAt(i)=='E' || in.charAt(i)=='I' ||in.charAt(i)=='O'||in.charAt(i)=='U') {
					vowel++;
				}else {
					conso++;
				}
			}
			System.out.println("Total Vowels are:"+vowel);
			System.out.println("Total consonents are:"+conso);
		};
		int b = 0;
		V1.count(b);

	}

}
