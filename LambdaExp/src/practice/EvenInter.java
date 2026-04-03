package practice;


interface Number{
	void show(int[] num);
}

class MyDetail{
	public static int Even(int [] num) {
		int digit[]= {10,15,14,17,18,16};
		
		for(int i=0;i<=digit.length-1;i++) {
			if(digit[i]%2==0) {
				System.out.println("The even number is:"+digit[i]);
			}
		}
		
		return 0;
		
	}
}

public class EvenInter {

	public static void main(String[] args) {
		Number N1=MyDetail::Even;
		int[] digit = null;
		N1.show(digit);

	}

}
