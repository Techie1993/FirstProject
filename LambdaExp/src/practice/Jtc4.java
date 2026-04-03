package practice;

public class Jtc4 {

	public static void main(String[] args) {
		DataInfo D1=(a,b)->{
			int Sum=a+b;
			System.out.println("Sum is:"+Sum);
		};
		D1.test(150,100);
		System.out.println("\n");
		DataInfo D2=(a,b)->{
			int Sub=a-b;
			System.out.println("Sub is:"+Sub);
		};
		D2.test(150,100);
		System.out.println("\n");
		DataInfo D3=(a,b)->{
			int product=a*b;
			System.out.println("Product is:"+product);
		};
		D3.test(150,100);


	}
}
