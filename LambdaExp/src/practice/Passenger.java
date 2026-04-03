package practice;

public class Passenger {

	public static void main(String[] args) {
		CityLambda C1=(city)->{
			System.out.println("Welcome to:"+city);
		};
		C1.test("Pune");
		System.out.println("\n");
		CityLambda C2=(city)->{
			System.out.println("Welcome to:"+city);
		};
		C2.test("Ahemdabad");
	}
}
