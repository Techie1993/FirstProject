package practice;

class Emp_Details{
	String name;
	String city;
	
	void show(String name,String city) {
		System.out.println("Name is:"+name);
		System.out.println("City is:"+city);
		
	}

	void display(String name, String City, String HQ) {
		// TODO Auto-generated method stub
		
	}

	
}

class EmpData extends Emp_Details{
	String HQ;
	@Override
	void display(String name,String City,String HQ) {
		System.out.println("The Name is:"+name);
		System.out.println("The City is:"+city);
		System.out.println("The HQ is:"+HQ);
		
		}

   }


public class Method_Over {

	public static void main(String[] args) {
		// Making an Object
		Emp_Details D1=new Emp_Details();
		D1.show("Simons","Adelaide");
		System.out.println("\n");
		EmpData D2=new EmpData();
		D2.display("Andy","Auckland","Perth");
	
		

	}

}
