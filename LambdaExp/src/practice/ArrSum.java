package practice;


@FunctionalInterface
interface SumArray{
	void cal(int [] data);
}

public class ArrSum {

	public static void main(String[] args) {
		
		SumArray S1=(nums)->{
			
			int sum=0;
			for(int i=0;i<=nums.length-1;i++) {
				sum=sum+nums[i];
			}
			System.out.println("Sum is:"+sum);	
		};
		
		int digit[]= {14,12,13,22};
		S1.cal(digit);
		
	}
}
