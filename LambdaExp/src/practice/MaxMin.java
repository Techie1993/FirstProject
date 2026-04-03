package practice;

import java.util.ArrayList;
import java.util.Optional;

@FunctionalInterface
interface Maximum{
	void Show(ArrayList<Integer>Data);
}

public class MaxMin {

	public static void main(String[] args) {
		
		ArrayList<Integer>Data=new ArrayList<Integer>();
		Data.add(14);
		Data.add(11);
		Data.add(10);
		Data.add(12);
		Data.add(17);
		
		Maximum M1=(e)->{
		
			Optional<Integer> Max=Data.stream().max((a,b)->a.compareTo(b));
			System.out.println(Max);
			
			Optional<Integer> Min=Data.stream().min((a,b)->a.compareTo(b));
			System.out.println(Min);		
		};
		M1.Show(Data);		
	}
}
