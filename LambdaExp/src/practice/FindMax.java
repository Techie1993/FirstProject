package practice;


interface Max{
	void show(int num[]);
}


public class FindMax {

	public static void main(String[] args) {
		int num[]= {10,12,14,41,25,54};
		
		Max M1=(a)->{
			int max=num[0];
			for(int i=0;i<=num.length-1;i++) {
				if(num[i]>max) {
					max=num[i];
				}
			}
			System.out.println("The maximum value is:"+max);

		};
		M1.show(num);
	}
}
