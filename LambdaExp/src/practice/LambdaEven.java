package practice;


@FunctionalInterface
interface Evenn{
	public void ShowEven(int [] data);
}

public class LambdaEven {

	public static void main(String[] args) {
		
		int digits[]= {14,12,11,19,21,22};
		
		Evenn E1=(a)->{
			for(int i=0;i<=digits.length-1;i++) {
				if(digits[i]%2==0) {
					System.out.println(digits[i]);
				}
			}
		};
		E1.ShowEven(digits);
	}
}
