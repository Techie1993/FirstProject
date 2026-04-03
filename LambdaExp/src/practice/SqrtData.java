package practice;

@FunctionalInterface
interface ShowSqrtt{
	void ShowSqrt(double [] nums);
}


@FunctionalInterface
interface Greater{
	void Show(int [] data);
}

public class SqrtData {

	public static void main(String[] args) {
		
		ShowSqrtt S1=(nums)->{
			for(int i=0;i<=nums.length-1;i++) {
				double sqrt=Math.sqrt(nums[i]);
				System.out.println("Square Root is:"+sqrt);
			}
		};
		double digits[]= {144,225,355};
		S1.ShowSqrt(digits);
		System.out.println("\n");
		
		Greater G1=(nums)->{
			for(int i=0;i<=nums.length-1;i++) {
				if(nums[i]>10) {
					System.out.println(nums[i]);
				}
			}
		};
		int data[]= {2,4,15,16,18};
		G1.Show(data);
	}
}
