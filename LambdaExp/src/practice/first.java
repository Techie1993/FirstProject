package practice;

@FunctionalInterface
interface I1{
	void m1();
	//void m2();
	
	default void m2() {
		System.out.println("M2 in Interface");
	}
	
	static void m4() {
		System.out.println("m4 in Interface");
	}
}

public class first {

	public static void main(String[] args) {
		I1 i1=()->{
			System.out.println("M1 in Interface");
		};
		i1.m1();
		i1.m2();
		

	}

}
