package practice;


@FunctionalInterface
 interface CarsShow {
	void showCar(String [] cars);
}

public class CarsArray {

	public static void main(String[] args) {
	
		CarsShow A1=(cars)->{
			for(String c:cars) {
				System.out.println(c);
			}	
		};
		
		String veh[]= {"Thar","Bolero","Harrier"};
		A1.showCar(veh);	
	}
}
