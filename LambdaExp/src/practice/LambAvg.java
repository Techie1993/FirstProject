package practice;

interface Average{
	void show(double [] data);
}

public class LambAvg {

	public static void main(String[] args) {
	
		double data[]= {14,24,27,28};
		
		Average A1=(a)->{
			
			// Calculating the sum of all the elements.
			double sum=0;
			for(int i=0;i<=data.length-1;i++) {
				sum=sum+data[i];
			}
			System.out.println("The sum of all elements is:"+sum);
		double avg=sum/4;
			System.out.println("The average of all elements is:"+avg);
		};
		A1.show(data);
	}

}
