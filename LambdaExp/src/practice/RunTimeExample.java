package practice;

import java.util.Scanner;

class BCS{
	void show() {
		// Taking user I/P
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your amount:");
		double amount=scan.nextDouble();
		if(amount>10000) {
			int otp=(int)(Math.random()*9000+1000);
			String OTP=String.valueOf(otp);
			System.out.println(OTP);
		}
		
	}
		
}

class St_Johns extends BCS{
	void show() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your amount:");
		double amount=scan.nextDouble();
		if(amount>20000) {
			int otp=(int)(Math.random()*9000+1000);
			String OTP=String.valueOf(otp);
			System.out.println(OTP);
		}
		
	}
}

public class RunTimeExample {

	public static void main(String[] args) {
		// Making an object
		BCS B1=new BCS();
		B1.show();
		
		St_Johns J1=new St_Johns();
		J1.show();
		
	}

}
