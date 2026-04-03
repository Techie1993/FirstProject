package practice;

@FunctionalInterface
interface Odd{
	void check(int a);
}

interface Pos{
	void confirm(int a);
}

interface Square{
	void ShowSquare(int[] data);
}

interface Sqrt{
	void ShowSqrt(double [] nums);
}

interface CarsData{
	void init(String[] cars);
}


public class CheckEvenOdd {

	public static void main(String[] args) {
		// Making an Object
		//CheckEvenOdd O1=new CheckEvenOdd();
		
		Odd A1=(a)->{
			if(a%2==0) {
				System.out.println("Number is Even");
			}else {
				System.out.println("Number is Odd");
			}
		};
		A1.check(15);
		
		Pos P1=(a)->{
			if(a>0) {
				System.out.println("Number is Positive");
			}else {
				System.out.println("Number is Negative");
			}
		};
		P1.confirm(10);
		
		Square S1=(numbers)->{
						
			for(int i=0;i<=numbers.length-1;i++) {
				int square=numbers[i] * numbers[i];
				System.out.println("Square is:"+square);
			}	
		};
		
		int[] digits = {2,5,6,8};
		S1.ShowSquare(digits);
		
		
		Sqrt S2=(nums)->{
						
			for(int i=0;i<=nums.length-1;i++) {
				double sqrt=Math.sqrt(nums[i]);
				System.out.println("Sqrt is:"+sqrt);
			}	
		};
		
		double[] numbs = {100,121,44,56};
		S2.ShowSqrt(numbs);
		
		
		CarsData C1=(cars)->{
			  for(int i=0;i<=cars.length-1;i++) {
				  if(cars[i].startsWith("C")) {
					  System.out.println(cars[i]);
				  }
			  }
		};
		
		String[] carinfo= {"City","Civic","Harrier","Safari"};
		C1.init(carinfo);	
	}
}
