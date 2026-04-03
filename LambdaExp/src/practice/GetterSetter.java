package practice;

class Student{
	private String name;
	private String city;
	private int age;
	
	void display() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.city);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}


public class GetterSetter {

	public static void main(String[] args) {
		// Making an Object.
		Student s1=new Student();
		s1.setName("steve");
		s1.setAge(20);
		s1.setCity("Nagpur");
		
		// Getting data.
		s1.getName();
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getCity());	
	
	}

}
