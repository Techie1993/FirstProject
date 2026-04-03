package practice;

@FunctionalInterface
interface Cars{
	void show(String[] cdata);
}

public class Startswith {

	public static void main(String[] args) {
		
		Cars C1=(cars)->{
			String veh[]= {"Safari","Swift","Scorpio","Creta"};
			for(int i=0;i<=veh.length-1;i++) {
				if(veh[i].startsWith("S")) {
					System.out.println(veh[i]);
				}
			}
		};
		
		String[] veh = null;
		C1.show(veh);			
	}
}
