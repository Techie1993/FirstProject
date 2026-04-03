package practice;

import java.util.Scanner;

interface numbers{
	void  show(int[] num);
}

interface Vowel{
	void show(String str);
}

public class StringInter {

	public static void main(String[] args) {
		
		int dig[]= {10,4,15,17,29,24};
		numbers N1=(a)->{
			
			for(int i=0;i<=dig.length-1;i++) {
				if(dig[i]%2==0) {
					System.out.println("Even numbers are:"+dig[i]);
				}else {
					System.out.println("Odd numbers are:"+dig[i]);
				}
			}	
		};
		N1.show(dig);
		
				
	}

}
