package practice;

import java.util.Arrays;

interface Comp{
	void show(String str);
}

class MyComp{
	public static String Company(String str) {
		
		String comp[]= {"CapG","Salesforce","ZOHO","Crompton","Comapac","Infosys"};
		
		for(int i=0;i<=comp.length-1;i++) {
			
			Arrays.sort(comp);
			if(comp[i].startsWith("C")) {
				System.out.println(comp[i]);
			}
		}
		System.out.println("The sequence is:"+Arrays.toString(comp));
		//System.out.println("The Company with C is:"+comp);
		//System.out.println("The company with c is:"+comp);
		return str;
		
	}
}

public class Organisation {

	public static void main(String[] args) {
		Comp C1=MyComp::Company;
		String comp = null;
		C1.show(comp);

	}
}
