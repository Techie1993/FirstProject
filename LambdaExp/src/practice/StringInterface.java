package practice;

@FunctionalInterface
interface I10{
	void m1(String s1);
	
	//void sum(int x,int y);
}
public class StringInterface {

	public static void main(String[] args) {
		I10 i1=(String s1)->{
			System.out.println("The String parameter is:"+s1);
		};
		
		i1.m1("JAVA-Spring");
		
		I10 I2=(String s1)->{
			System.out.println("The value of string is:"+s1);
			System.out.println("The value of string is:"+s1);
			System.out.println("The value of string is:"+s1);
			System.out.println("The value of string is:"+s1);
			
		};
		
		I2.m1("Spring");
		
		System.out.println("\n");
		// Calculating the sum 
		
		
		
		
		
	}

}
