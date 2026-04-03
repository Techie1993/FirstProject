package practice;

public class JTC {

	public static void main(String[] args) {
		DetDetails D1=(name)->{
			System.out.println("Hello"+" "+name+"Welcome to Lambda World...");	
		};
		D1.display("Akshay");
		System.out.println("\n");
		DetDetails D2=(name)->{
			System.out.println("Hello"+" "+name);	
		};
		D2.display("Fred");
		System.out.println("\n");
		DetDetails D3=(name)->{
			System.out.println("Hello"+" "+name);	
		};
		D3.display("Williams");

		

		
		

	}

}
