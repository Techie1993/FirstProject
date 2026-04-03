package practice;

@FunctionalInterface
interface Sum{
	void show(int a);
}

@FunctionalInterface
interface Even{
	void display(int b);
}

@FunctionalInterface
interface Rem{
	void data(int c);
}


public class EvenSum {

	public static void main(String[] args) {
		
		Summing S1=(a)->{
			int sum=0;
			for(int i=0;i<=10;i++) {
				sum=sum+i;
			}
			System.out.println("the sum is:"+sum);
		};
		int a = 0;
		S1.show(a);
		
		System.out.println("Calculating the sum of even numbers\n");
		Even E1=(b)->{
			int total=0;
			for(int i=0;i<=10;i++) {
				if(i%2==0) {
					total=total+i;
				}
			}
			System.out.println("The sum of Even numbers is:"+total);
						
		};
		E1.display(a);
		
		System.out.println("Calculating the sum of Oodd Numbers\n");
		Rem o1=(c)->{
			int total_sum=0;
			for(int i=0;i<=10;i++) {
				if(i%2!=0) {
					total_sum=total_sum+i;
				}
			}
			System.out.println("The sum of Odd Numbers is:"+total_sum);
			
		};
		o1.data(a);
	}

}
