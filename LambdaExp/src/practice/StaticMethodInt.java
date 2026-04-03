package practice;

interface User{
	double show(double a,double b,double c);
}

class MyData{
	public static double Avg(double a,double b,double c) {
		double d=a+b+c;
		return d/3;
	}
}


public class StaticMethodInt {

	public static void main(String[] args) {
		// Implementing the Static method interface.
		User U1=MyData::Avg;
		double x=U1.show(10,25,50);
		System.out.println(x);
		
		
	}

}
