package practice;


@FunctionalInterface
interface CheckP{
	void check(int a);
}

public class CheckPos {

	public static void main(String[] args) {
		
		CheckP C1=(a)->{
			if(a>0) {
				System.out.println("Nnumber is Positive");
			}else {
				System.out.println("Number is Negative");
			}
		};
		
		C1.check(-10);
	}
}
