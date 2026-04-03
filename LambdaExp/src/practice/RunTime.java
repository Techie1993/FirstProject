package practice;

class infosys{
	String name;
	String city;
	String HQ;
	
	// methods
	void show() {
		System.out.println("Company name is:"+name);
		System.out.println("Company city is:"+city);
		System.out.println("Company HQ is:"+HQ);
	}
}

class Genpact extends infosys{
	String technology;
	@Override
	// methods
		void show() {
			System.out.println("Company name is:"+name);
			System.out.println("Company city is:"+city);
			System.out.println("Company HQ is:"+HQ);
			System.out.println("Company Technology is:"+technology);
		}

}

public class RunTime {

	public static void main(String[] args) {
		// Making an object
		infosys I=new infosys();
		I.name="Infosys";
		I.city="Pune";
		I.HQ="Sydney";
		I.show();
		System.out.println("\n");
		Genpact G1=new Genpact();
		G1.name="Andy";
		G1.city="Hinjewadi";
		G1.HQ="Adelaide";
		G1.technology="JAVA";
		G1.show();
	}

}
