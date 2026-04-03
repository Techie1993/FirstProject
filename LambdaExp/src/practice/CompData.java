package practice;


@FunctionalInterface
interface Companies{
	void showComp(String[] comp);
}

public class CompData {

	public static void main(String[] args) {
			
		Companies C1=(comp)->{
			for(String c:comp) {
				System.out.println(c);
			}
		};
		
		String comp[]= {"Delloite","Synechron","HCL"};
		C1.showComp(comp);
		
	}
}
