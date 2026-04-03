package practice;

import java.util.Scanner;

@FunctionalInterface
interface Area {
	public void getArea(int a);
	
}

@FunctionalInterface
interface Vol{
	public void getVol(int b);
}


public class LambdaArea {

	public static void main(String[] args) {
		// Using lambda Expression
		Area A1=(a)->{
			// Taking user I/P
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter radius of circle:");
			double rad=scan.nextDouble();
			double res=3.14*rad*rad;
			System.out.println("The Area of circle is:"+res);
		};
		int a = 0;
		A1.getArea(a);
		
		// Using Lambda Expression.
		Vol V1=(b)->{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter radius of cylinder:");
			System.out.println("Enter height of cylinder:");
			double rad=scan.nextDouble();
			double hgt=scan.nextDouble();
			double result=3.14*rad*rad*hgt;
			System.out.println("The volume of cylinder is:"+result);

		};
		int b = 0;
		V1.getVol(b);
	}
	
}
