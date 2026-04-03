package practice;

interface even{
	void show(int digits[]);
}

public class EvenDig {

	public static void main(String[] args) {
		int digits[]= {14,15,17,27,24,25};
		
		even E1=(a)->{
			for(int i=0;i<=digits.length-1;i++) {
				if(digits[i]%2==0) {
					System.out.println("The even numbers are:"+digits[i]);
				}else {
					System.out.println("The odd digits are:"+digits[i]);
				}
			}
			
		};
		E1.show(digits);
	}

}
