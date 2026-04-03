package practice;


@FunctionalInterface
interface Arrays{
	void Min(int[] nums);
}

@FunctionalInterface
interface SumArr{
	void Sum(int[] nums);
}


public class FindMin {

	public static void main(String[] args) {
		
		int numb[]= {14,12,11,36};
		
		Arrays A1=(data)->{
			int min=numb[0];
			for(int i=0;i<=numb.length-1;i++) {
				if(numb[i]<min) {
					min=numb[i];
				}
			}
			System.out.println("Minimum value:"+min);
		};
		
		A1.Min(numb);
		
		System.out.println("Sum of array\n");
		
		SumArr S1=(sum)->{
			int total=0;
			int digit[]= {2,3,4,5};
			
			for(int i=0;i<=digit.length-1;i++) {
				total=total+digit[i];
			}
		
			System.out.println("Total is:"+total);
		};
		
		S1.Sum(numb);	
	}
}
