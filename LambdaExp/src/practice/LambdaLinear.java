package practice;

import java.util.Scanner;

interface Linear{
	void show(String []data);
}

public class LambdaLinear {

	public static void main(String[] args) {
		// Making an array
		String car[]= {"Thar","Ertiga","Scorpio","Safari"};
		
		// Taking user I/p
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your car:");
		String name=scan.next();
		Linear A1=(a)->{
			boolean flag=false;
			for(int i=0;i<=car.length-1;i++) {
				if(name.equals(car[i])) {
					flag=true;
					System.out.println("Car is Available:");
					break;
				}
			}
			
			if(flag==false) {
				System.out.println("Car is Not Available");
			}
		};
		A1.show(car);	
	}
}
