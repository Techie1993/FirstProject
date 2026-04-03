package practice;


@FunctionalInterface
interface Sqrtt{
	void show(double [] data);
}

public class ArrSqrt {

	public static void main(String[] args) {
	
		Sqrtt S1=(nums)->{
			
				for(int i=0;i<=nums.length-1;i++) {
				int sqrt=(int) Math.sqrt(nums[i]);
				System.out.println("Square Root is:"+sqrt);
			}	
		};
		double digit[]= {121,144,225,625};
		S1.show(digit);
	}
}
