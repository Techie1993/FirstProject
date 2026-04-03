package practice;


@FunctionalInterface
interface EvenNumb{
	void check(int a);
}

@FunctionalInterface
interface NumbArray{
	void check(int []data);
}

@FunctionalInterface
interface CarArray{
	void check(String []cardata);
}

public class FilterEven {

	public static void main(String[] args) {
		
		EvenNumb E1=(a)->{
			if(a%2==0) {
				System.out.println("Number is Even");
			}else {
				System.out.println("It is Odd");
			}
		};
		E1.check(21);
		
		System.out.println("\n");
		NumbArray N1=(numbers)->{
			for(int i=0;i<=numbers.length-1;i++) {
				if(numbers[i]%2==0)
				System.out.println(numbers[i]);
			}
		};
		int data[]= {14,15,22,27,29};
		N1.check(data);
		
		System.out.println("Cars\n");
		CarArray  C1=(cars)->{
			for(int i=0;i<=cars.length-1;i++) {
				if(cars[i].startsWith("S")) {
					System.out.println(cars[i]);
				}
			}
		};
		String cars[]= {"Scorpio","Safari","Creta","City","Sumo","Swift"};
		C1.check(cars);
		
		
	}
}
