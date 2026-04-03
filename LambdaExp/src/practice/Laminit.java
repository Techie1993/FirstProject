package practice;


@FunctionalInterface
interface LamArray{
	void Show(String[] data);
}


@FunctionalInterface
interface ArrRemove{
	void Show(int[] data);
}

public class Laminit {

	public static void main(String[] args) {
		
		LamArray L1=(cars)->{
			
			for(int i=0;i<=cars.length-1;i++) {
				if(cars[i].startsWith("C")) {
					System.out.println(cars[i]);
				}
			}
		};
		
		String veh[]= {"Creta","Civic","City","Safari","Sumo"};
		L1.Show(veh);
		
		System.out.println("Removing data\n");
		
		ArrRemove A1=(nums)->{
			
			int rem=30;
			int temp[]=new int[nums.length-1];
			int j=0;
			
			  for(int i=0;i<=nums.length-1;i++) {
				  if(nums[i]!=rem) {
					  temp[j++]=nums[i];
				  }
			  }
			  
			  for(int data:temp) {
				  System.out.println(data);
			  }
		};	
		
		int Data[]= {10,20,30,45};
		A1.Show(Data);
	}
}
