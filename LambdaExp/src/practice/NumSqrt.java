package practice;


@FunctionalInterface
interface EvenSqrt{
	public void ShowEven(double [] data);
}

public class NumSqrt {

	public static void main(String[] args) {
		double nums[]= {144.0,121.0,169.00,155.00,165.00};

		EvenSqrt E1=(a)->{
						
			for(int i=0;i<=nums.length-1;i++) {
				double MData=Math.sqrt(nums[i]);
				System.out.println(MData);
			}
		};
		
		E1.ShowEven(nums);
	}
}
