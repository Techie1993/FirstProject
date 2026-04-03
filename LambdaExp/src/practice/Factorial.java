package practice;


@FunctionalInterface
interface Facto{
	void Show(int a);
}

public class Factorial {

	public static void main(String[] args) {
		
		int num=5;
		
		Facto F1=(a)->{
			
			long factorial=1;
			for(int i=1;i<=num;i++) {
				factorial=factorial * i;
			}
			System.out.println(factorial);
		};
		
		F1.Show(num);
	}
}
