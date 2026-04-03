package practice;

interface Freq{
	void show(int data[]);
}


public class FreqRep {

	public static void main(String[] args) {
		int data[]= {14,24,14,10,9,14,14};
		
		Freq F1=(a)->{
			int count=0; int key=14;
			for(int i=0;i<=data.length-1;i++) {
				if(data[i]==key) {
					count++;
				}
			}
			System.out.println("Frequency of 14 is:"+count);
		};
		F1.show(data);
	}

}
