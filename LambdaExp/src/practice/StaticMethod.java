package practice;

class University{
	String name;
	int age;
	String Dep;
	static String u_name;
	
	void display() {
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Department is:"+Dep);
		System.out.println("University Name is:"+u_name);	
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// Making an Object.
		University U1=new University();
		U1.name="Akshay";
		U1.age=20;
		U1.Dep="IT";
		U1.u_name="Pune University";
		U1.display();
		
	}

}
