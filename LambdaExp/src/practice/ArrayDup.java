package practice;

interface Dup{
	void show(int []num);
}

public class ArrayDup {

	public static void main(String[] args) {
		ArrayDup D1=new ArrayDup();
		int num[]= {10,24,14,10,26,26};
		Dup A1=(a)->{
			boolean flag=false;
			for(int i=0;i<=num.length-1;i++) {
				for(int k=i+1;k<=num.length-1;k++) {
					if(num[i]==num[k]) {
						flag=true;
						System.out.println("Duplicate value found is:"+num[i]+" "+"at:"+i);
						break;
					}
				}
			}
			
			if(flag==false) {
				System.out.println("No Duplicate data");
			}
		};
		A1.show(num);
	}
}
