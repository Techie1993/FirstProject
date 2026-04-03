package practice;

interface Hello{
	int test(int a,int b);
}

class MyInteger{
	public static int FindSum(int a,int b) {
		System.out.println("Find sum of a,and b in My integer");
		int c=a+b;
		return c;
		
	}
}

public class MethodInterface {

	public static void main(String[] args) {
		System.out.println("Main in JTC");
		Hello h1=(a,b)->{
			int c=a+b;
			System.out.println("test in JTC");
			return c;
			
		};
		int i=h1.test(100,200);
		System.out.println(i);
		
		System.out.println("*****\n");
		Hello h2=MyInteger::FindSum;
		int x=h2.test(20,20);
		System.out.println(x);
		
		/*Hello h3=MyInteger::FindSum;
		int y=h3.test(14,29);
		System.out.println(y);*/
	}

}
