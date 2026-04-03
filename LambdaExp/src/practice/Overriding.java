package practice;

class Office{
	String name;
	String city;
	
	void show() {
		System.out.println("***Printing Data***");
		System.out.println("The name is:"+name);
		System.out.println("The City is:"+city);
	}

	@Override
	public String toString() {
		return "Office [name=" + name + ", city=" + city + "]";
	}
	
}

class Details extends Office{
	String HQ;
	void display() {
		System.out.println("The HQ is:"+HQ);
		System.out.println("The name is:"+name);
		System.out.println("The City is:"+city);

	}
	@Override
	public String toString() {
		return "Details [HQ=" + HQ + "]";
	}
	
	
}

public class Overriding {

	public static void main(String[] args) {
		// Making an Object
		Office O1=new Office();
		O1.name="Simons";
		O1.city="Sydney";
		System.out.println(O1);

		Details D1=new Details();
		D1.name="Andy";
		D1.city="Adelaide";
		D1.HQ="Sydney";
		System.out.println(D1);
		
	}

}
