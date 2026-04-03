package practice;

class abc{
	String name;
	String city;
	void show() {
		System.out.println("Name is:"+name);
		System.out.println("City is:"+city);
	}
	@Override
	public String toString() {
		return "abc [name=" + name + ", city=" + city + "]";
	}
	
}

class xyz extends abc{
	/*void show() {
		System.out.println("Name is:"+name);
		System.out.println("City is:"+city);
	}*/
}

public class Dynamic {

	public static void main(String[] args) {
		// Making an Object
		abc a1=new abc();
		a1.name="andy";
		a1.city="sydney";
		System.out.println(a1);
		
		abc a2=new xyz();
		a2.name="Steve";
		a2.city="Adelaide";
		System.out.println(a2);
	}

}
