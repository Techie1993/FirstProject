package practice;

public class Calculate {

	public static void main(String[] args) {
		Addition A1=(a,b)->{
			int sum=a+b;
			System.out.println("Sum is:"+sum);
		};
		A1.cal(100, 150);
		System.out.println("\n");
		Addition A2=(a,b)->{
			int sub=a-b;
			System.out.println("Substraction is:"+sub);
		};
		A2.cal(100, 50);
		System.out.println("\n");
		Addition A3=(a,b)->{
			int mul=a*b;
			System.out.println("Multiplication is:"+mul);
		};
		A3.cal(100, 50);
		
		System.out.println("\n");
		Addition A4=(a,b)->{
			int Div=a/b;
			System.out.println("Division is:"+Div);
		};
		A4.cal(100,50);
		
		System.out.println("Multiplication\n");
		Addition A5=(a,b)->{
			int mul=a*b;
			System.out.println("Product is:"+mul);
		};
		A5.cal(10, 20);	
	}
}
