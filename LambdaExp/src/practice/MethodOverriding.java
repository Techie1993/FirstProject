package practice;

class CapG{
	String name;
	String HQ;
	String Chairman;
	
	void show(String name,String HQ,String Chairman) {
		System.out.println("Name is:"+name);
		System.out.println("HQ is:"+HQ);
		System.out.println("Chairman is:"+Chairman);	
	}
}

class cybage extends CapG{
	String technology;
	String location;
	void show(String name,String HQ,String Chairman,String technology,String location) {
		System.out.println("Name is:"+name);
		System.out.println("HQ is:"+HQ);
		System.out.println("Chairman is:"+Chairman);
		System.out.println("Technology is:"+technology);
		System.out.println("Location is:"+location);
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		// Making an object
		CapG C1=new CapG();
		C1.show("Capgemini","Pune","Charles Hudson");
		System.out.println("\n");
		cybage C2=new cybage();
		C2.show("Cybage","Mumbai","Narayan Murthy","JAVA","Mumbai");
		
		
	}

}
