package practice;

interface Avg{
	void show(int[] num);
}

interface High{
	void display(int[] num);
}

public class AverageSmallestLargest {

	public static void main(String[] args) {
		
		int num[]= {10,14,15,25,24};
		Avg A1=(a)->{
			int sum=0;
			for(int i=0;i<=num.length-1;i++) {
				sum=sum+num[i];
			}
			System.out.println("The sum of integers is:"+sum);
			System.out.println("Calculating average except Highest and Smallest\n");
			int total=sum-35;
			double res=total/3;
			System.out.println("The average except highest and lowest is:"+res);
			
		};
		A1.show(num);
		
	}
	
}
