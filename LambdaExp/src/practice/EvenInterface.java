package practice;


interface customer{
	 int show(int a,int b,int c,int d);
}


interface arr1{
	void show(int [] num);

	
}

class MyCust{
	public static int Prod(int a,int b,int c,int d) {
		int e=(a+b)-(c+d);
		return e;
	}
}

class MyArr{
	public static void even(int[] num) {
		int dig[]= {2,14,7,15,8};
		for(int i=0;i<=dig.length-1;i++) {
			if(dig[i]%2==0) {
				System.out.println(+i+" "+"is even");
			}else {
				System.out.println(+i+" "+"is Odd");
			}
		}
	}
}

public class EvenInterface {

	public static void main(String[] args) {
		
		customer c1=MyCust::Prod;
		int x=c1.show(101, 200, 35, 55);
		System.out.println(x);
		
		arr1 A1=MyArr::even;
		int [] dig=A1.show(dig[]);
	}

}
