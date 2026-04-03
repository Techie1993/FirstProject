package practice;

@FunctionalInterface
interface ArraySquare{
	void Square(int[]data);
}

@FunctionalInterface
interface ArraySqRoot{
	void Square(int[]nums);
}

@FunctionalInterface
interface GreaterThan{
	void Greater(int[]nums);
}

public class NumbsSquares {

	public static void main(String[] args) {
		
		ArraySquare A1=(numbs)->{
			
			for(int i=0;i<=numbs.length-1;i++) {
				int square=numbs[i] * numbs[i];
				System.out.println(square);
			}	
		};
		int Data[]= {14,22,51,23,17};
		A1.Square(Data);
		
		System.out.println("Square Root\n");
		ArraySqRoot S1=(nums)->{
			
			for(int i=0;i<=nums.length-1;i++) {
				int Sqroot=(int) Math.sqrt(nums[i]);
				System.out.println(Sqroot);
			}
		};
		
		int digits[]= {100,144,196,169};
		S1.Square(digits);
		
		System.out.println("Greater Than\n");
		GreaterThan G1=(nums)->{
			for(int i=0;i<=nums.length-1;i++) {
				if(nums[i]>15) {
					System.out.println(nums[i]);
				}
			}
		};
		int data[]= {2,3,14,25,26};
		G1.Greater(data);
	}
}
