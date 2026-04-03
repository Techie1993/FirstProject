package practice;


@FunctionalInterface
interface SquareD{
	void Square(int [] data);
}

@FunctionalInterface
interface EvenSquare{
	void Esquare(int [] Data);
}


public class ArrSquare {

	public static void main(String[] args) {
		
		SquareD S1=(nums)->{
			for(int i=0;i<=nums.length-1;i++) {
				int square=nums[i] * nums[i];
				System.out.println("Square is:"+square);
			}
		};
		int data[]= {14,11,12,22,13};
		S1.Square(data);
		
		System.out.println("\n");
		EvenSquare E1=(enums)->{
			for(int i=0;i<enums.length-1;i++) {
				if(enums[i]%2==0) {
					int esquare=enums[i] * enums[i];
					System.out.println("Even Square is:"+esquare);
				}
			}	
		};
		
		int numbers[]= {14,11,9,15,16,18};
		E1.Esquare(numbers);	
	}
}
