package practice;


@FunctionalInterface
interface CheckData{
	void check(int a);
}

@FunctionalInterface
interface CheckYear{
	void check(int a);
}

@FunctionalInterface
interface Square1{
	void check(int [] data);
}

@FunctionalInterface
interface SqRoot{
	void check(double[] numbers);
}

public class CheckEven {

	public static void main(String[] args) {
		
		CheckData C1=(a)->{
			if(a%2==0) {
				System.out.println("Number is Even");
			}else {
				System.out.println("Number is Odd");
			}
		};
		C1.check(16);
		
		System.out.println("Checking Years for Leap\n");
		
		CheckYear C2=(year)->{
			if(year%4==0) {
				System.out.println("Year is Leap");
			}else {
				System.out.println("Year is NOT leap");
			}
		};
		C2.check(2021);
		
		System.out.println("Array Square\n");
		
		Square1 S1=(nums)->{
			
			for(int i=0;i<=nums.length-1;i++) {
				int square=nums[i] * nums[i];
				System.out.println(square);
			}
		};
		
		int Data[]= {10,14,15,26};
		S1.check(Data);
		
		System.out.println("SquareRoot\n");
		
		SqRoot S2=(data)->{
			for(int i=0;i<=data.length-1;i++) {
				double Sqrt=Math.sqrt(data[i]);
				System.out.println(Sqrt);
			}
		};
		 double Numbers[]= {100.00,225.0,625.0,196.0,228.0};
		 S2.check(Numbers);
			
	}
}
