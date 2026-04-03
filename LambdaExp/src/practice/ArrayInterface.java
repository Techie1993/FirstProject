package practice;


interface Array{
	void show(int[] num);
}

class MyArray{
	public static int FindSum(int [] num) {
		int dig[]= {10,15,5,14,25};
		int sum=0;
		for(int i=0;i<=dig.length-1;i++) {
			sum=sum+dig[i];
			if(dig[i]%2==0) {
				System.out.println("the even numbers is:"+dig[i]);
			}

		}
				System.out.println("The sum of all digits is:"+sum);
			
		return sum;
		
		
		
		
	}

}

public class ArrayInterface {

	public static void main(String[] args) {
		
		Array A1=MyArray::FindSum;
		int[] dig = null;
		A1.show(dig);

	}

}
