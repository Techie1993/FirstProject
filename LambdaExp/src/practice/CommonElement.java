package practice;

interface comm{
	void show(int[]num,int[]dig);
}

public class CommonElement {

	public static void main(String[] args) {
		
		int num[]= {10,15,14,25,44};
		int dig[]= {14,55,66,15,199};
		comm A1=(a,b)->{
			boolean flag=false;
			for(int i=0;i<=num.length-1;i++) {
				for(int k=0;k<=dig.length-1;k++) {
					if(num[i]==dig[k]) {
						flag=true;
						System.out.println("Common element found:"+num[i]);
						break;
					}
				}
			}
			
			if(flag==false) {
				System.out.println("No Elements are Common");
			}
		};
		A1.show(num, dig);
		
	}

}
