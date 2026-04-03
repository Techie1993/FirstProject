package practice;

interface Sum2{
	void show(int [] num);
}


class Information{
	public static int Sum(int [] num) {
		int sum=0;
		for(int i=0;i<=15;i++) {
			sum=sum+i;
		}
		System.out.println("the sum is:"+sum);
		
		int total=0;
		for(int i=0;i<=15;i++) {
			if(i%2==0) {
				total=total+i;
			}
		}
		System.out.println("The sum of even numbers is:"+total);
		int Odd=sum-total;
		System.out.println("The sum of Odd numbers is:"+Odd);
		return sum;
		
	}
}

// Method Interface

public class EvenOddSum {

	public static void main(String[] args) {
		Sum2 S1=Information::Sum;
		int[] i = null;
		S1.show(i);
		

	}

}
