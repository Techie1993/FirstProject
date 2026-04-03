package practice;

class StudentData{
	String name;
	int age;
	
	void show(String name,int age) {
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}
	
	void show1(String name,int age,String city) {
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("City is:"+city);
	}
}

public class Overloading {

	public static void main(String[] args) {
		// Making an object.
		StudentData D1=new StudentData();
		D1.show("Akshay",20);
		System.out.println("\n");
		D1.show1("Oscar", 21,"Pune");

	}

}
