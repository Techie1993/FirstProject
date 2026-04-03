package practice;


@FunctionalInterface
interface EvenNum{
	void Show(int [] data);
}

public class Elambda {

	public static void main(String[] args) {
	
		EvenNum E1=(nums)->{
			
			for(int i=0;i<=nums.length-1;i++) {
				if(nums[i]%2==0) {
					System.out.println(nums[i]);
				}
			}	
		};
		
		int digit[]= {12,8,9,19,22};
		E1.Show(digit);
	}
}
