package practice;


@FunctionalInterface
interface Areaa{
	void show(double area);
}

public class CircleLambda {

	public static void main(String[] args) {
		
		Areaa A1=(a)->{
			
			double rad=5.5;
			double area=3.14 *rad* rad;
			System.out.println(area);
		};
		
	    double rad = 0;
		A1.show(rad);			
	}
}
