package practice;

@FunctionalInterface
interface Oddd{
	void check(int a);
}


@FunctionalInterface
interface Cname{
	void show(String city);
}

public class CityLam {

	public static void main(String[] args) {
		Oddd A1=(a)->{
			if(a%2!=0) {
				System.out.println("Number is odd");
			}else {
				System.out.println("Number is even");
			}	
		};
		A1.check(7);
		
		
		Cname A2=(a)->{
			System.out.println("City is:"+a);
		};
		A2.show("Pune");
	}	
}
