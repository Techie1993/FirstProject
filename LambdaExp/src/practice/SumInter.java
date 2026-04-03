package practice;

@FunctionalInterface
interface I5{
	void sum(int x,int y);
	
}

interface I6{
	void prod(int x,int y);
}

interface I7{
	void avg(double x,double y,double z);
}

interface I8{
	void even(int p,int q,int r,int s);
}

public class SumInter {

	public static void main(String[] args) {
		I5 i1=(a,b)->{
			int ab=b-a;
			System.out.println("The product is:"+ab);
		};
		i1.sum(100,150);
		
		System.out.println("\n");
		
		// Calculating the product
		I6 i2=(a,b)->{
			int ab=a*b;
			System.out.println("The product is:"+ab);
		};
		i2.prod(3, 4);
		i2.prod(4,5);
		
		System.out.println("\n");
		
		// Calculating the average
		I7 i3=(a,b,c)->{
			double sum=a+b+c;
			double data=sum/3;
			System.out.println("The Average is:"+data);
		};
		i3.avg(10,10,15);
		
		System.out.println("\n");
			
	}

}
