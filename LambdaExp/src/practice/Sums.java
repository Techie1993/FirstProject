package practice;


@FunctionalInterface
interface AddData{
	void cal(int [] data);
}

@FunctionalInterface
interface SquareData{
	void Squares(int []data);
}

public class Sums {

	public static void main(String[] args) {
		
		AddData A1=(nums)->{
			
			int sum=0;
			for(int i=0;i<=nums.length-1;i++) {
				sum=sum+nums[i];
			}
			System.out.println("Sum is:"+sum);	
		};
		int digits[]= {5,14,19,21};
		A1.cal(digits);
	
		System.out.println("Squares\n");
		
		SquareData S1=(nums)->{
			
			for(int i=0;i<=nums.length-1;i++) {
				int squares=nums[i] * nums[i];
				System.out.println("Squares is:"+squares);
			}
			
		};
		int Numb[]= {12,14,22,16};
		S1.Squares(Numb);
			
	}
}
