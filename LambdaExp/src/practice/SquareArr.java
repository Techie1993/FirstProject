package practice;


@FunctionalInterface
interface Squaree{
	void Show(int[] data);
}

@FunctionalInterface
interface SquareRoot{
	void Show(int[] data);
}


public class SquareArr {

	public static void main(String[] args) {
		
		Squaree S1=(nums)->{
			
			for(int i=0;i<=nums.length-1;i++) {
				int sq=nums[i] * nums[i];
				System.out.println(sq);
			}
		};
		
		int Digit[]= {10,15,22};
		S1.Show(Digit);
		
		System.out.println("Square root\n");
		
		SquareRoot S2=(nums)->{
			
			for(int i=0;i<=nums.length-1;i++) {
				double sqrt=Math.sqrt(nums[i]);
				System.out.println("Square root is:"+sqrt);
			}	
		};
	
		int Digits[]= {100,225,641,251};
		S2.Show(Digits);
	}
}
