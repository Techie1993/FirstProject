package practice;

interface Occ{
	void show(int[] num);
	
}

public class LambdaOccurence {

	public static void main(String[] args) {
		int num[]= {10,15,25,10,10,25,15};
		Occ A1=(a)->{
			int count=0; int fre=0; int rep=0;
			int key=10; int val=15; int data=25;
			for(int i=0;i<=num.length-1;i++) {
				if(num[i]==key) {
					count++;
				}else if(num[i]==val) {
					fre++;
				}else if(num[i]==data) {
					rep++;
				}else {
					System.out.println("");
				}
			}
			System.out.println("Frequency of 10 is:"+count);
			System.out.println("Frequency of 15 is:"+fre);
			System.out.println("Frequency of 25 is:"+rep);

			
		};
		A1.show(num);

	}

}
