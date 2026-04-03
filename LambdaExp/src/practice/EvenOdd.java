package practice;

@FunctionalInterface
interface A3{
	void m1(int arr);
}

interface A4{
	void m2(int num);
}

public class EvenOdd {

	public static void main(String[] args) {
		int[] arr= {10,15,14,16,19};
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]%2==0) {
				int i1=(arr[i]);
				System.out.println("The even numbers are:"+arr[i]);
				
			}else {
				if(arr[i]%2!=0) {
					System.out.println("The Odd Number are:"+arr[i]);
				}
			} 
		}
		
		
		System.out.println("\n");
		
		int[] num= {2,4,6,9,11,13};
		for(int j=0;j<=num.length-1;j++) {
			int i4=(num[j]);
			if(i4%2==0) {
				System.out.println(i4);
			}
				
			
		}	
		
	}

}
