package practice;

interface Arr{
	void check(int[] num);
}

interface perfect{
	void data(int[] digit);
}

public class ArrayNum {

	public static void main(String[] args) {
		// Making an Object
		//ArrayNum N1=new ArrayNum();
		
		int num[]= {2,4,5,8,7,9};
		Arr A1=(a)->{
			for(int i=0;i<=num.length-1;i++) {
				
				if(num[i]%2==0) {
					System.out.println("Number is Even");
				}else {
					System.out.println("Number is Odd");
				}
			}
		};
		A1.check(num);
	
		System.out.println("****Perfect Square***\n");
		
		int digit[]= {5,6,4,10,9,7,17};
		perfect P1=(a)->{
			for(int i=0;i<=digit.length-1;i++) {
				if(digit[i]%2==0) {
					System.out.println("Number is Perfect Number");
				}else {
					System.out.println("Number is Not Perfect Number");
				}
			}
		};
		P1.data(digit);

	}
				
}
